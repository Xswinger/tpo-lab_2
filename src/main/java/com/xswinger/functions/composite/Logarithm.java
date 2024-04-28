package com.xswinger.functions.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.basic.NaturalLogarithm;
import com.xswinger.functions.basic.Sinus;
import com.xswinger.util.Parser;

public class Logarithm extends AbstractFunction{

    private Integer BASE;

    private NaturalLogarithm log;

    public Logarithm() {}

    public Logarithm(NaturalLogarithm log, Integer base) {
        this.log = log;
        this.BASE = base;
    }

    public Logarithm(NaturalLogarithm log, Integer base, String funcName) {
        super(new Parser(funcName), funcName);
        this.log = log;
        this.BASE = base;
    }

    @Override
    public Double calculate(double value) {
        return (log.calculate(value) / log.calculate(BASE));
    }

}
