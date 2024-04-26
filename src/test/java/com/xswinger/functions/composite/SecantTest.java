package com.xswinger.functions.composite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.mockito.Mock;
import org.mockito.Spy;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.ArgumentProvider;

public class SecantTest {

    @Spy
    private Secant sec;
    @Mock
    private Cosine mockCos;

    @BeforeEach
    public void init() {
        this.sec = new Secant(mockCos);
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(funcValue, sec.calculate(seriesValue), AbstractFunction.EPSILON);
    }

}
