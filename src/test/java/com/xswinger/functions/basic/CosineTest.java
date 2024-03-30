package com.xswinger.functions.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CosineTest {

    private final Cosine cos = new Cosine();

    @ParameterizedTest
    @CsvSource({"0, 1", "1, 0.5403", "-1, 0.5403", "2, -0.4161", "-2, -0.4161", "3, -0.9899", "-3, -0.9899", "5, 0.2836", "-5, 0.2836"})
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(funcValue, cos.calc(seriesValue, 10), 0.02);
    }

}
