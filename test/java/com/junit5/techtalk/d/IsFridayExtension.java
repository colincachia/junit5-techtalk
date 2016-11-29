package com.junit5.techtalk.d;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.TestExecutionCondition;
import org.junit.jupiter.api.extension.TestExtensionContext;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;

/**
 * Created by Colin on 29/11/2016.
 */
public class IsFridayExtension implements TestExecutionCondition {

    @Override
    public ConditionEvaluationResult evaluate(TestExtensionContext testExtensionContext) {
        final DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        if (DayOfWeek.FRIDAY.equals(dayOfWeek)) {
            return ConditionEvaluationResult.disabled("Go have a beer!");
        }
        return ConditionEvaluationResult.enabled("Live long, and prosper");
    }
}
