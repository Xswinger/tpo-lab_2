package com.xswinger.functions.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.basic.Sinus;
import com.xswinger.util.Parser;

public class Cotangent extends AbstractFunction {

    private Sinus sinus;
    private Cosine cosine;

    public Cotangent() {}

    public Cotangent(Sinus sinus, Cosine cosine) {
        this.sinus = sinus;
        this.cosine = cosine;
    }

    public Cotangent(Sinus sinus, Cosine cosine, String funcName) {
        super(new Parser(funcName), funcName);
        this.sinus = sinus;
        this.cosine = cosine;
    }

    @Override
    public Double calculate(double value) {
        return (cosine.calculate(value) / sinus.calculate(value));
    }

}
