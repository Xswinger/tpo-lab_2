package com.xswinger.util;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestsHolder {

    private static final Map<Double, Double> sinTestValue = new TreeMap<Double, Double>() {{
        put(-3.0, -0.14112);
        put(-2.5, -0.598472);
        put(-2.0, -0.909297);
        put(-1.5, -0.997495);
        put(-1.0, -0.841471);
        put(-0.5, -0.479426);
        put(0.0, 0.0);
        put(0.5, 0.479426);
        put(1.0, 0.841471);
        put(1.5, 0.997495);
        put(2.0, 0.909297);
        put(2.5, 0.598472);
        put(3.0, 0.14112);
    }};

    private static final Map<Double, Double> cosTestValue = new TreeMap<Double, Double>() {{
        put(-3.0, -0.989992);
        put(-2.5, -0.801144);
        put(-2.0, -0.416147);
        put(-1.5, 0.0707372);
        put(-1.0, 0.540302);
        put(-0.5, 0.877583);
        put(0.0, 1.0);
        put(0.5, 0.877583);
        put(1.0, 0.540302);
        put(1.5, 0.0707372);
        put(2.0, -0.416147);
        put(2.5, -0.801144);
        put(3.0, -0.989992);
    }};

    private static final Map<Double, Double> tanTestValue = new TreeMap<Double, Double>() {{
        put(-2.5, 0.747022);
        put(-2.0, 2.18504);
        put(-1.5, -14.10142);
        put(-1.0, -1.55741);
        put(-0.5, -0.546302);
        put(0.0, 0.0);
        put(0.5, 0.546302);
        put(1.0, 1.55741);
        put(1.5, 14.10142);
        put(2.0, -2.18504);
        put(2.5, -0.747022);
    }};

    private static final Map<Double, Double> cotTestValue = new TreeMap<Double, Double>() {{
        put(-2.5, 1.33865);
        put(-2.0, 0.457658);
        put(-1.5, -0.0709148);
        put(-1.0, -0.642093);
        put(-0.5, -1.83049);
        put(0.5, 1.83049);
        put(1.0, 0.642093);
        put(1.5, 0.0709148);
        put(2.0, -0.457658);
        put(2.5, -1.33865);
    }};

    private static final Map<Double, Double> secTestValue = new TreeMap<Double, Double>() {{
        put(-3.0, -1.01011);
        put(-2.0, -2.403);
        put(-1.0, 1.85082);
        put(0.0, 1.0);
        put(1.0, 1.85082);
        put(2.0, -2.403);
        put(3.0, -1.01011);
    }};

    private static final Map<Double, Double> cscTestValue = new TreeMap<Double, Double>() {{
        put(-3.0, -7.08617);
        put(-2.0, -1.09975);
        put(-1.0, -1.1884);
        put(-0.5, -2.08583);
        put(0.5, 2.08583);
        put(1.0, 1.1884);
        put(2.0, 1.09975);
        put(3.0, 7.08617);
    }};

    private static final Map<Double, Double> lnTestValue = new TreeMap<Double, Double>() {{
        put(1.0, 0.0);
        put(2.0, 0.693147);
        put(5.0, 1.60944);
        put(10.0, 2.30259);
    }};

    private static final Map<Double, Double> log2TestValue = new TreeMap<Double, Double>() {{
        put(1.0, 0.0);
        put(2.0, 1.0);
        put(5.0, 2.3219);
        put(10.0, 3.32193);
    }};

    private static final Map<Double, Double> log5TestValue = new TreeMap<Double, Double>() {{
        put(1.0, 0.0);
        put(2.0, 0.4307);
        put(5.0, 1.0);
        put(10.0, 1.43068);
    }};

    private static final Map<Double, Double> log10TestValue = new TreeMap<Double, Double>() {{
        put(1.0, 0.0);
        put(2.0, 0.30103);
        put(5.0, 0.69897);
        put(10.0, 1.0);
    }};

    private static final Map<Double, Double> equationTestValue = new TreeMap<Double, Double>() {{
        put(-3.0, 1.4036061E45);
        put(-2.0, 5.9036559E21);
        put(-1.0, 3353352.0213);
        put(1.0, 0.0);
        put(2.0, 21.45116);
        put(5.0, 2064.9644);
        put(10.0, 15658.6382);
    }};

    public static final Map<String, Map<Double, Double>> testValues = new HashMap<String, Map<Double, Double>>() {{
        put("Sinus", sinTestValue);
        put("Cosine", cosTestValue);
        put("Tangent", tanTestValue);
        put("Cotangent", cotTestValue);
        put("Secant", secTestValue);
        put("Cosecant", cscTestValue);
        put("NaturalLogarithm", lnTestValue);
        put("Logarithm2", log2TestValue);
        put("Logarithm5", log5TestValue);
        put("Logarithm10", log10TestValue);
        put("EquationSystem", equationTestValue);
    }};
}
