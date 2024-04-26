package com.xswinger.functions.composite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.mockito.Mock;
import org.mockito.Spy;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.ArgumentProvider;
import com.xswinger.functions.basic.NaturalLogarithm;

public class Logarithm2Test {

    private final int BASE = 2;

    @Spy
    private Logarithm log;
    @Mock
    private NaturalLogarithm mockLn;

    @BeforeEach
    public void init() {
        this.log = new Logarithm(mockLn, BASE);
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(int base, double seriesValue, double funcValue) {
        assertEquals(funcValue, log.calculate(seriesValue), AbstractFunction.EPSILON);
    }

}
