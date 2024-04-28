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
import com.xswinger.functions.basic.NaturalLogarithm;
import com.xswinger.util.TestsHolder;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Logarithm2Test {

    private final int BASE = 2;

    @Spy
    private Logarithm log;
    @Mock
    private NaturalLogarithm mockLn = new NaturalLogarithm();

    @BeforeEach
    public void init() {
        this.log = new Logarithm(mockLn, BASE);
        Map<Double, Double> stubs = ArgumentProvider.getStubs("NaturalLogarithm");
        for (Map.Entry<Double, Double> dot : stubs.entrySet()) {
            when(mockLn.calculate(dot.getKey())).thenReturn(dot.getValue());
        }
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(log.calculate(seriesValue), funcValue, AbstractFunction.EPSILON);
    }

}
