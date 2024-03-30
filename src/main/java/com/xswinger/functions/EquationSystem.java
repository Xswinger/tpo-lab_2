package com.xswinger.functions;

import com.xswinger.functions.basic.Cosine;
import com.xswinger.functions.basic.Sinus;
import com.xswinger.functions.composite.Cosecant;
import com.xswinger.functions.composite.Cotangent;
import com.xswinger.functions.composite.Logarithm;
import com.xswinger.functions.composite.Secant;
import com.xswinger.functions.composite.Tangent;

public class EquationSystem {

    private final Cosecant csc = new Cosecant();
    private final Cotangent cot = new Cotangent();
    private final Logarithm log = new Logarithm();
    private final Secant sec = new Secant();
    private final Tangent tan = new Tangent();
    private final Cosine cos = new Cosine();
    private final Sinus sin = new Sinus();

    private final double firstEquation(double x, int acc) {
        if (x <= 0) {
            return (
                (
                    (
                        Math.pow(
                            (
                                Math.pow(
                                    Math.pow((
                                        (
                                            (
                                                Math.pow((
                                                    (
                                                        (
                                                            (
                                                                Math.pow((tan.calc(x, acc) * sec.calc(x, acc)) * cos.calc(x, acc), 2)
                                                            ) - sec.calc(x, acc)
                                                        ) * Math.pow(csc.calc(x, acc), 2)
                                                    ) + cos.calc(x, acc)
                                                ), 2) + cot.calc(x, acc)
                                            ) - (
                                                cos.calc(x, acc) - (cos.calc(x, acc) + cos.calc(x, acc))
                                            )
                                        ) / (
                                            sec.calc(x, acc) + csc.calc(x, acc)
                                        )
                                    ), 2), 3
                                ) * (cos.calc(x, acc) / sec.calc(x, acc))
                            ), 3
                        ) - (
                            (tan.calc(x, acc) + cot.calc(x, acc)) * (tan.calc(x, acc) + cos.calc(x, acc))
                        )
                    ) + csc.calc(x, acc)
                ) * (
                    Math.pow(
                        (
                            (
                                sin.calc(x, acc) / tan.calc(x, acc)
                            ) - (
                                tan.calc(x, acc) * (Math.pow(sec.calc(x, acc), 2) * csc.calc(x, acc))
                            )
                        ), 2
                    ) - (
                            (
                                Math.pow(
                                    (
                                        cos.calc(x, acc) * (cot.calc(x, acc) * Math.pow((sin.calc(x, acc) / sec.calc(x, acc)), 2))
                                    ), 3
                                ) * Math.pow(
                                    sin.calc(x, acc), 2
                                )
                            ) / (
                                (
                                    (
                                        Math.pow(csc.calc(x, acc), 3) - csc.calc(x, acc)) / cot.calc(x, acc)
                                ) - (
                                (
                                    (
                                        sin.calc(x, acc) / (cos.calc(x, acc) + (cot.calc(x, acc) / tan.calc(x, acc)))
                                    ) / (
                                        (cot.calc(x, acc) / sin.calc(x, acc)) - sec.calc(x, acc)
                                    )
                                ) - (
                                    (
                                        sin.calc(x, acc) / Math.pow(cos.calc(x, acc), 3)
                                    ) - (
                                        (sec.calc(x, acc) / sec.calc(x, acc)) / csc.calc(x, acc)
                                    )
                                )
                            )
                        )
                    )
                )
            );
        } else {
            return x;
        }
    }

    private final double secondEquation(double x, int acc) {
        if (x > 0) {
            return Math.pow(
                (
                    (
                        Math.pow((log.calc(5, x) + log.calc(2, x)), 2) + log.calc(10, x)
                    ) + log.calc(5, x)
                ), 3
            );
        } else {
            return x;
        }
    }

}
