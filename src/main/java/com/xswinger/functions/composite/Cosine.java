package com.xswinger.functions.composite;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.basic.Sinus;
import com.xswinger.util.Parser;

public class Cosine extends AbstractFunction {

    private Sinus sinus;

    public Cosine() {}

    public Cosine(Sinus sinus) {
        this.sinus = sinus;
    }

    public Cosine(Sinus sinus, String funcName) {
        super(new Parser(funcName), funcName);
        this.sinus = sinus;
    }

    @Override
    public Double calculate(double value) {
        double temp = value % (2 * Math.PI);

        if (value < 0) {
            temp += 2 * Math.PI;
        }

        if (temp > Math.PI / 2 && temp < (Math.PI + Math.PI / 2)) {
            return -Math.sqrt(1 - Math.pow(sinus.calculate(value), 2));
        } else {
            return Math.sqrt(1 - Math.pow(sinus.calculate(value), 2));
        }
    }
}
