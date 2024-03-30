package com.xswinger.functions.composite;

import com.xswinger.functions.basic.Cosine;
import com.xswinger.functions.basic.Sinus;
import com.xswinger.interfaces.CompositeFunction;

public class Cotangent implements CompositeFunction {

    private Sinus sinus = new Sinus();
    private Cosine cosine = new Cosine();

    @Override
    public double calc(double value, int acc) {
        return (cosine.calc(value, acc) / sinus.calc(value, acc));
    }

}
