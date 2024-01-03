package org.hans.demo.cli;

import java.util.HashMap;
import java.util.Map;

public class CLIFunctions {

    public static Map<String, Object> toMap (CLIArguments cliArguments) {
        Map<String, Object> params = new HashMap<>();

        params.put("description", cliArguments.getKeyWord());
        params.put("location", cliArguments.getLocation());
        params.put("page", cliArguments.getPage());
        params.put("full_time", cliArguments.isFullTime());

        if (cliArguments.isMarkDown() == true) {
            params.put("markdown", true);
        }

        return params;
    }

}
