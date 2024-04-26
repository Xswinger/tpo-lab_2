package com.xswinger.functions.composite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.mockito.Mock;
import org.mockito.Spy;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.ArgumentProvider;
import com.xswinger.functions.basic.Sinus;

public class CotangentTest {

    @Mock
    private Sinus mockSinus;
    @Mock
    private Cosine mockCosine;
    @Spy
    private Cotangent mockCot;

    @BeforeEach
    public void init() {
        mockCot = new Cotangent(mockSinus, mockCosine);
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(funcValue, mockCot.calculate(seriesValue), AbstractFunction.EPSILON);
    }

}
