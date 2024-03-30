package com.xswinger.functions.composite;

import com.xswinger.functions.basic.Cosine;
import com.xswinger.interfaces.CompositeFunction;

public class Secant implements CompositeFunction {

    private Cosine cosine = new Cosine();

    @Override
    public double calc(double value, int acc) {
        return (1/cosine.calc(value, acc));
    }

}
