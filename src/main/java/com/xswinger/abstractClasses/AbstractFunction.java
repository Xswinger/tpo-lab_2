package com.xswinger.abstractClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xswinger.interfaces.BasicFunction;
import com.xswinger.util.Parser;

public abstract class AbstractFunction implements BasicFunction {

    public static final double EPSILON = 0.00000000001;

    public static final int ACCURACY = 100;

    @Override
    public Double calculateFactorial(int acc) {
        Double value = new Double(1);
        for (int i = 2; i <= acc; i++) {
            value = value * i;
        }
        return value;
    }

    @Override
    public double[] calculateAll(double[] x) {
        double[] results = new double[x.length];

        for (int i = 0; i < x.length; i++) {
            results[i] = this.calculate(x[i]);
        }

        return results;
    }

}
