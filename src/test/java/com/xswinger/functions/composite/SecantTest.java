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
public class SecantTest {

    @Spy
    private Secant sec;
    @Mock
    private Cosine mockCos = new Cosine();

    @BeforeEach
    public void init() {
        this.sec = new Secant(mockCos);
        Map<Double, Double> stubs = ArgumentProvider.getStubs("Cosine");
        for (Map.Entry<Double, Double> dot : stubs.entrySet()) {
            when(mockCos.calculate(dot.getKey())).thenReturn(dot.getValue());
        }
    }

    @ParameterizedTest
    @ArgumentsSource(ArgumentProvider.class)
    public void calcTest(double seriesValue, double funcValue) {
        assertEquals(sec.calculate(seriesValue), funcValue, AbstractFunction.EPSILON);
    }

}
