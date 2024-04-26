package com.xswinger.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class ArgumentProvider implements ArgumentsProvider {

    public final Stubs stubs = new Stubs(); 

    //TODO rewrite
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        // String contextName = context.getTestClass().get().getSimpleName();
        // String funcName = contextName.substring(0, contextName.length() - 4);
        
        // stubs.setFunk(funcName);

        // List<Arguments> args = new ArrayList<>();
        
        // Map<Double, Double> lis = stubs.getDots();

        // for (Map.Entry<Double, Double> entry: lis.entrySet()) {
        //     args.add(Arguments.of(entry.getKey(), entry.getValue()));
        // }

        // return args.stream();
        return null;
    }

}
