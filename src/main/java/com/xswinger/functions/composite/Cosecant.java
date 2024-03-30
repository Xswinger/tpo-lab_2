package com.xswinger.functions.composite;

import com.xswinger.functions.basic.Sinus;
import com.xswinger.interfaces.CompositeFunction;

public class Cosecant implements CompositeFunction {

    private Sinus sinus = new Sinus();

    @Override
    public double calc(double value, int acc) {
        return (1 / sinus.calc(value, acc));
    }

}
