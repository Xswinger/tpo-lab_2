package com.xswinger.functions.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.basic.Sinus;
import com.xswinger.util.Parser;

public class Tangent extends AbstractFunction {

    private Sinus sinus;
    private Cosine cosine;

    public Tangent(Sinus sinus, Cosine cosine) {
        this.sinus = sinus;
        this.cosine = cosine;
    }

    public Tangent(Sinus sinus, Cosine cosine, String funcName) {
        super(new Parser(funcName), funcName);
        this.sinus = sinus;
        this.cosine = cosine;
    }

    @Override
    public Double calculate(double value) {
        return (sinus.calculate(value)/cosine.calculate(value));
    }
    
}
