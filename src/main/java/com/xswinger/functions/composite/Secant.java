package com.xswinger.functions.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.basic.Sinus;
import com.xswinger.util.Parser;

public class Secant extends AbstractFunction {

    private Cosine cosine;

    public Secant() {}

    public Secant(Cosine cosine) {
        this.cosine = cosine;
    }

    public Secant(Cosine cosine, String funcName) {
        super(new Parser(funcName), funcName);
        this.cosine = cosine;
    }

    @Override
    public Double calculate(double value) {
        return (1/cosine.calculate(value));
    }

}
