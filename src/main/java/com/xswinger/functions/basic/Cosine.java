package com.xswinger.functions.basic;

import com.xswinger.interfaces.TrigonometricFunction;

public class Cosine implements TrigonometricFunction {

    private double[] stubs = new double[] {
        -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5
    };

    // Sinus sinus = new Sinus(); 

    @Override
    public double calc(double value, int acc) {
        double res = (
            Math.pow(-1, acc) * (
                (
                    Math.pow(value, 2 * acc)
                ) / (
                    calcFactorial(2 * acc)
                )
            )
        );
        return res;
    }

    // @Override
    // public double calc(double value, int acc) {
    //     double res = Math.sqrt(1 - Math.pow(sinus.calc(value, acc), 2));
    //     return res;
    // }

    @Override
    public double calcFactorial(int acc) {
        long fact = 1;
        for (int i = 2; i <= acc; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
