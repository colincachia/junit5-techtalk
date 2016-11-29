package com.junit5.techtalk.a;

import com.junit5.techtalk.SimpleClass;
import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleClassTest {
    final static private Logger LOG = Logger.getLogger(SimpleClassTest.class.getSimpleName());

    final private SimpleClass classUnderTest = new SimpleClass();

    @BeforeAll
    static void beforeAll() {
        LOG.info("Running BEFORE ALL");
    }

    @BeforeEach
    void beforeEach() {
        LOG.info("Running BEFORE EACH");
    }

    @AfterEach
    void afterEach() {
        LOG.info("Running AFTER EACH");
    }

    @AfterAll
    static void afterAll() {
        LOG.info("Running AFTER ALL");
    }

    @Test
    void testReturnsTrue() {
        assertTrue(classUnderTest.returnsTrue(), "This method should return true");
    }

    @Test
    void testReturnsFalse() {
        assertFalse(classUnderTest.returnsFalse(), "This method should return false");
    }

    @Test
    @DisplayName("Must return null")
    void testReturnsNull() {
        assertNull(classUnderTest.returnsNull(), "This method should return null");
    }
}
