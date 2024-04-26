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

public class CosecantTest {

    @Mock
    private Sinus mockSinus;
    @Spy
    private Cosecant csc; 

    @BeforeEach
    public void init() {
        csc = new Cosecant(mockSinus);
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(funcValue, csc.calculate(seriesValue), AbstractFunction.EPSILON);
    }

}
