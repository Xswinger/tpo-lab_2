package com.xswinger.functions.composite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SecantTest {

    private final Secant sec = new Secant();

    @ParameterizedTest
    @CsvSource({"1, 0", "2, 0.6931", "3, 1.0986", "4, 1.3863", "-2, -0.4161", "3, -0.9899", "-3, -0.9899", "5, 0.2836", "-5, 0.2836"})
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(funcValue, sec.calc(seriesValue, 5), 0.02);
    }

}