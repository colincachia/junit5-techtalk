package com.junit5.techtalk.c;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
 * Created by Colin on 29/11/2016.
 */
public class DynamicCreationTest {

    @TestFactory
    List<DynamicTest> createPointTests() {
        return Arrays.asList(
                dynamicTest(
                        "Testing true",
                        () -> {
                            Assertions.assertTrue(true);
                        }),
                dynamicTest(
                        "Testing false",
                        () -> {
                            Assertions.assertFalse(false);
                        })
        );
    }

}
