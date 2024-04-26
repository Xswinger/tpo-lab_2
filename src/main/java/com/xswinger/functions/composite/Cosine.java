package com.xswinger.functions.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.basic.Sinus;

public class Cosine extends AbstractFunction {

    private Sinus sinus;

    public Cosine(Sinus sinus) {
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
