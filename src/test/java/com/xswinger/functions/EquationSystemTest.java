package com.xswinger.functions;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.mockito.Spy;

public class EquationSystemTest {

    @Spy
    private final EquationSystem system = new EquationSystem();

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double value, double expectedResult) {
        assertEquals(expectedResult, system.calculate(value), 0.02);
    }

}
