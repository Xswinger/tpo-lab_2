package com.xswinger.functions.basic;

import com.xswinger.interfaces.CompositeFunction;

public class Cosine implements CompositeFunction {

    private double[] stubs = new double[] {
        -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5
    };

    Sinus sinus = new Sinus(); 

    @Override
    public double calc(double value, int acc) {
        double res = Math.sqrt(1 - Math.pow(sinus.calc(value, acc), 2));
        return res;
    }

}
