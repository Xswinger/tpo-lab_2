package com.xswinger.functions.composite;

import com.xswinger.functions.basic.NaturalLogarithm;

public class Logarithm {

    NaturalLogarithm log = new NaturalLogarithm();

    public double calc(int base, double value) {
        return (log.calc(value, 0) / log.calc(base, 0));
    }

}
