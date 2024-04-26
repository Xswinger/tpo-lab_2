package com.xswinger.functions.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.xswinger.abstractClasses.AbstractFunction;
import com.xswinger.functions.basic.NaturalLogarithm;

public class Logarithm extends AbstractFunction{

    private final Integer BASE;

    private NaturalLogarithm log;

    public Logarithm(NaturalLogarithm log, Integer base) {
        this.log = log;
        this.BASE = base;
    }

    @Override
    public Double calculate(double value) {
        return (log.calculate(value) / log.calculate(BASE));
    }

}
