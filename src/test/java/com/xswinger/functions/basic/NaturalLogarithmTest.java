package com.xswinger.functions.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.ArgumentProvider;

public class NaturalLogarithmTest {

    private final NaturalLogarithm log = new NaturalLogarithm();

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(funcValue, log.calculate(seriesValue), AbstractFunction.EPSILON);
    }

}
