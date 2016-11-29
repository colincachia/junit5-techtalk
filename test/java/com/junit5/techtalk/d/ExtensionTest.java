package com.junit5.techtalk.d;

import com.junit5.techtalk.SimpleClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Created by Colin on 29/11/2016.
 */
@ExtendWith(TimingExtension.class)
public class ExtensionTest {

    private SimpleClass classUnderTest = new SimpleClass();

    @Test
    void testSomething() {
        Assertions.assertFalse(classUnderTest.returnsFalse());
    }

}
