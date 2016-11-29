package com.junit5.techtalk.d;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExtensionContext;

import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 * Created by Colin on 29/11/2016.
 */
public class TimingExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    private static final Logger LOG = Logger.getLogger(ExtensionTest.class.getName());

    @Override
    public void beforeTestExecution(final TestExtensionContext context) throws Exception {
        getStore(context).put(context.getTestMethod().get(), System.currentTimeMillis());
    }

    @Override
    public void afterTestExecution(final TestExtensionContext context) throws Exception {
        final Method testMethod = context.getTestMethod().get();
        final long start = getStore(context).remove(testMethod, long.class);
        final long duration = System.currentTimeMillis() - start;

        LOG.info(() -> String.format("Method [%s] took %s ms.", testMethod.getName(), duration));
    }

    private ExtensionContext.Store getStore(final TestExtensionContext context) {
        return context.getStore(ExtensionContext.Namespace.create(getClass(), context));
    }
}
