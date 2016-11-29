package com.junit5.techtalk.b;

import com.junit5.techtalk.SimpleClass;
import com.junit5.techtalk.a.SimpleClassTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Colin on 29/11/2016.
 */
public class LambdaAssertionTest {

    final static private Logger LOG = Logger.getLogger(SimpleClassTest.class.getSimpleName());

    private SimpleClass classUnderTest = new SimpleClass();

    @Test
    void assertAllProperties() {
        assertAll("Class under test",
                () -> assertEquals(true, classUnderTest.returnsTrue()),
                () -> assertEquals(false, classUnderTest.returnsFalse()),
                () -> assertEquals(null, classUnderTest.returnsNull(), "Should be null")
        );
    }

    @DisplayName("When False")
    @Nested
    class NestedLambdaAssertionFalseTest {

        @Test
        @DisplayName("is false")
        void isFalse() {
            assertFalse(classUnderTest.returnsFalse());
        }
    }

    @DisplayName("When True")
    @Nested
    class NestedLambdaAssertionTrueTest {

        @Test
        @DisplayName("is true")
        void isFalse() {
            assertTrue(classUnderTest.returnsTrue());
        }
    }

}
