package com.xswinger.functions;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.mockito.Spy;

import com.xswinger.abstractClasses.AbstractFunction;

public class EquationSystemTest {

    @Spy
    private final EquationSystem system = new EquationSystem();

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double value, double expectedResult) {
        if (value <= 0) {
            assertEquals(system.calculate(value), expectedResult, Math.pow(EquationSystem.EPSILON, Math.abs(value) * 10 + 10));
        } else {
            assertEquals(system.calculate(value), expectedResult, AbstractFunction.EPSILON);
        }
    }

}
