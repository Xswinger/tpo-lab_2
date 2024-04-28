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

public class TangentTest {

    @Spy
    private Tangent tan;
    @Mock
    private Sinus mockSin = new Sinus();
    @Mock
    private Cosine mockCos = new Cosine(mockSin);

    @BeforeEach
    public void init() {
        this.tan = new Tangent(mockSin, mockCos);
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(tan.calculate(seriesValue), funcValue, AbstractFunction.EPSILON);
    }

}
