package com.xswinger.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stubs {

    private final Map<String, List<Integer>> testValues = new HashMap<String, List<Integer>>() {{
        put("Sin", (List<Integer>) new ArrayList<Integer>() {{
            add(1);
        }});
    }};
}
