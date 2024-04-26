package com.xswinger.functions.composite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.ArgumentProvider;
import com.xswinger.functions.basic.Sinus;

@ExtendWith(MockitoExtension.class)
public class CosineTest {

    @Mock
    private Sinus mockSin;
    @Spy
    private Cosine mockCos;

    @BeforeEach
    public void init() {
        mockCos = new Cosine(mockSin);
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(funcValue, mockCos.calculate(seriesValue), AbstractFunction.EPSILON);
    }

}
