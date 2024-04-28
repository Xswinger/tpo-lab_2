package com.xswinger;

import java.util.Map;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.EquationSystem;
import com.xswinger.functions.basic.NaturalLogarithm;
import com.xswinger.functions.basic.Sinus;
import com.xswinger.functions.composite.Cosecant;
import com.xswinger.functions.composite.Cosine;
import com.xswinger.functions.composite.Cotangent;
import com.xswinger.functions.composite.Logarithm;
import com.xswinger.functions.composite.Secant;
import com.xswinger.functions.composite.Tangent;
import com.xswinger.util.TestsHolder;


public class App {

    private static final Sinus innerSinus = new Sinus();
    private static final Cosine innerCosine = new Cosine(innerSinus);

    private static final AbstractFunction[] functions = new AbstractFunction[] {
        new Sinus("Sinus"),
        new Cosine(innerSinus, "Cosine"),
        new Tangent(innerSinus, innerCosine, "Tangent"),
        new Cotangent(innerSinus, innerCosine, "Cotangent"),
        new Secant(innerCosine, "Secant"),
        new Cosecant(innerSinus, "Cosecant"),
        new NaturalLogarithm("NaturalLogarithm"),
        new Logarithm(new NaturalLogarithm(), 2, "Logarithm2"),
        new Logarithm(new NaturalLogarithm(), 5, "Logarithm5"),
        new Logarithm(new NaturalLogarithm(), 10, "Logarithm10"),
        new EquationSystem("EquationSystem")
    };

    public static void main( String[] args ) {
        for (AbstractFunction func: functions) {
            Map<Double, Double> testsValue = TestsHolder.testValues.get(func.funcName);

            double[] xs = new double[testsValue.entrySet().size()];
            double[] ys = new double[testsValue.entrySet().size()];

            for (int i = 0; i < testsValue.entrySet().size(); i++) {
                double x = (double) testsValue.keySet().toArray()[i];
                double result = func.calculate(x);

                xs[i] = x;
                ys[i] = result;
            }
            
            func.parser.write(xs, ys);
        }
    }
}
