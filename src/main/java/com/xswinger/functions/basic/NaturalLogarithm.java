package com.xswinger.functions.basic;

import com.xswinger.interfaces.BasicFunction;

public class NaturalLogarithm implements BasicFunction {

    private double[] stubs = new double[] {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    };

    @Override
    public double calc(double value, int acc) {
        value -= 1;
        
        double res = ( 
            Math.pow(-1, acc) * 
            (
                Math.pow(value, acc + 1)
            ) / (
                acc + 1
            )
        );
        return res;
    }

}
