package com.xswinger.functions.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.basic.Sinus;

public class Cosecant extends AbstractFunction {

    private Sinus sinus;

    public Cosecant(Sinus sinus) {
        this.sinus = sinus;
    }

    @Override
    public Double calculate(double value) {
        return (1 / sinus.calculate(value));
    }

}
