package com.xswinger.functions.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.xswinger.abstractClasses.AbstractFunction;

public class NaturalLogarithm extends AbstractFunction {

    @Override
    public Double calculate(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Logarathm argument an't be less then zero");
        }

        double res = 0;
        
        for (int i = 1; i <= ACCURACY; i+=2) {
            res += Math.pow((1 - x) / (1 + x), i) / i;
        }
        
        return -2 * res;
    }

}
