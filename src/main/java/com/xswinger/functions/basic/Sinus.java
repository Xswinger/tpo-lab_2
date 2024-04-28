package com.xswinger.functions.basic;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.util.Parser;

public class Sinus extends AbstractFunction {

    public Sinus() {}

    public Sinus(String funcName) {
        super(new Parser(funcName), funcName);
    }

    @Override
    public Double calculate(double x) {
        double res = 0;

        for (int i = 0; i <= ACCURACY; i++) {
            res += (
                (
                    Math.pow(-1, i) * Math.pow(x, 2 * i + 1)
                ) / (
                    calculateFactorial(2 * i + 1)
                )
            );
        }

        return res;
    }

}
