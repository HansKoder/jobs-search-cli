package org.hans.demo.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {

    @Parameter(
            descriptionKey = "KEYWORD",
            description = "KEYWORD",
            required = true
    )
    public String keyWord;

    



}
