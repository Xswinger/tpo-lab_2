package com.xswinger.functions.composite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LogarithmTest {

    private final Logarithm log = new Logarithm();

    @ParameterizedTest
    @CsvSource({"1, 0", "2, 0.6931", "3, 1.0986", "4, 1.3863", "-2, -0.4161", "3, -0.9899", "-3, -0.9899", "5, 0.2836", "-5, 0.2836"})
    public void calcTest(int base, double seriesValue, double funcValue) {
        assertEquals(funcValue, log.calc(base, seriesValue), 0.02);
    }

}
