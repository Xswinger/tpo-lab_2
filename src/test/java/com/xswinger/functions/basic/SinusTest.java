package com.xswinger.functions.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.ArgumentProvider;

public class SinusTest {

    private final Sinus sin = new Sinus();

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(funcValue, sin.calculate(seriesValue), AbstractFunction.EPSILON);
    }

}
