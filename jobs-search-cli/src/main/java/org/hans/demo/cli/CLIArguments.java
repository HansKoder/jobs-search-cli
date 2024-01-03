package org.hans.demo.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {

    @Parameter(
            descriptionKey = "KEYWORD",
            description = "KEYWORD",
            validateWith = CLIKeywordValidator.class,
            required = true
    )
    private String keyWord;

    @Parameter(
            names = {"--location", "-l"},
            description = "Each iteration could include a location"
    )
    private String location;

    @Parameter(
            names = {"--page", "-p"},
            description = "The API could return 50 results"
    )
    private int page = 0;

    @Parameter(
            names = {"--full-time"},
            description = "If I should query jobs of full time"
    )
    private boolean isFullTime = false;


    @Parameter(
            names = {"--markdown"},
            description = "MarkDown"
    )
    private boolean isMarkDown = false;

    @Parameter(
            names = {"--help", "-h"},
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "show options"
    )
    private boolean isHelp;


    public String getKeyWord() {
        return keyWord;
    }


    public boolean isHelp() {
        return isHelp;
    }

    public String getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public boolean isMarkDown() {
        return isMarkDown;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyWord='" + keyWord + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkDown=" + isMarkDown +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance () {
        return new CLIArguments();
    }
}
