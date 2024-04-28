package com.xswinger.functions.composite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.ArgumentProvider;
import com.xswinger.functions.basic.Sinus;
import com.xswinger.util.TestsHolder;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class CotangentTest {

    @Mock
    private Sinus mockSinus = new Sinus();
    @Mock
    private Cosine mockCosine = new Cosine(null);
    @Spy
    private Cotangent mockCot;

    @BeforeEach
    public void init() {
        mockCot = new Cotangent(mockSinus, mockCosine);
        Map<Double, Double> sinStubs = ArgumentProvider.getStubs("Sinus");
        for (Map.Entry<Double, Double> dot : sinStubs.entrySet()) {
            when(mockSinus.calculate(dot.getKey())).thenReturn(dot.getValue());
        }
        Map<Double, Double> cosStubs = ArgumentProvider.getStubs("Cosine");
        for (Map.Entry<Double, Double> dot : cosStubs.entrySet()) {
            when(mockCosine.calculate(dot.getKey())).thenReturn(dot.getValue());
        }
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(mockCot.calculate(seriesValue), funcValue, AbstractFunction.EPSILON);
    }

}
