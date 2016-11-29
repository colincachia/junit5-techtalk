package junit5.techtalk;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleClassTest {
    private SimpleClass classUnderTest = new SimpleClass();

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
