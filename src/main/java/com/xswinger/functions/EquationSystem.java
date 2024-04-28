package com.xswinger.functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.basic.NaturalLogarithm;
import com.xswinger.functions.basic.Sinus;
import com.xswinger.functions.composite.Cosecant;
import com.xswinger.functions.composite.Cosine;
import com.xswinger.functions.composite.Cotangent;
import com.xswinger.functions.composite.Logarithm;
import com.xswinger.functions.composite.Secant;
import com.xswinger.functions.composite.Tangent;
import com.xswinger.util.Parser;

public class EquationSystem extends AbstractFunction {

    private final Sinus sin = new Sinus();
    private final Cosine cos = new Cosine(sin);
    private final Cosecant csc = new Cosecant(sin);
    private final Secant sec = new Secant(cos);
    private final Cotangent cot = new Cotangent(sin, cos);
    private final Tangent tan = new Tangent(sin, cos);
    private final NaturalLogarithm ln = new NaturalLogarithm();
    private final Logarithm log2 = new Logarithm(ln, 2);
    private final Logarithm log5 = new Logarithm(ln, 5);
    private final Logarithm log10 = new Logarithm(ln, 10);

    public static final double EPSILON = 10;

    public EquationSystem() {}

    public EquationSystem(String funcName) {
        super(new Parser(funcName), funcName);
    }

    @Override
    public Double calculate(double x) {
        if (x <= 0) {
            double firstNumeratorMinuend = Math.pow((((Math.pow((tan.calculate(x) * sec.calculate(x)) * cos.calculate(x), 2)) - sec.calculate(x)) * Math.pow(csc.calculate(x), 2)) + cos.calculate(x), 2) + cot.calculate(x);
            double firstDenumeratorЫubtrahend = (cos.calculate(x) - (cos.calculate(x) + cos.calculate(x)));

            double firstNumerator = firstNumeratorMinuend - firstDenumeratorЫubtrahend;
            double firstDenominator = (sec.calculate(x) + csc.calculate(x));

            double firstFactor = (Math.pow(Math.pow(Math.pow(firstNumerator / firstDenominator, 2), 3) * (cos.calculate(x) / sec.calculate(x)), 3) - ((tan.calculate(x) + cot.calculate(x)) * (tan.calculate(x) + cos.calculate(x)))) + csc.calculate(x);

            double secondNumerator = Math.pow((cos.calculate(x) * (cot.calculate(x) * Math.pow((sin.calculate(x) / sec.calculate(x)), 2))), 3) * Math.pow(sin.calculate(x), 2);
            double secondDenumerator = ((Math.pow(csc.calculate(x), 3) - csc.calculate(x)) / (cot.calculate(x))) - ((((sin.calculate(x)) / (cos.calculate(x) + (cot.calculate(x) / tan.calculate(x)))) / ((cot.calculate(x) / sin.calculate(x)) - sec.calculate(x))) - ((sin.calculate(x) / Math.pow(cos.calculate(x), 3)) - ((sec.calculate(x) / sec.calculate(x)) / csc.calculate(x))));

            double secondFactor = Math.pow((sin.calculate(x) / tan.calculate(x)) - (tan.calculate(x)), 2) - (secondNumerator / secondDenumerator);

            return firstFactor * secondFactor;
        } else {
            return Math.pow(
                ((Math.pow((log5.calculate(x) + log2.calculate(x)), 2) + log10.calculate(x)) + log5.calculate(x)), 3
            );
        }
    }

}
