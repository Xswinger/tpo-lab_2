package com.xswinger.functions.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xswinger.abstractClasses.AbstractFunction;

public class Sinus extends AbstractFunction {

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
