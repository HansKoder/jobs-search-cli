package org.hans.demo;

import com.beust.jcommander.JCommander;
import org.hans.demo.cli.CLIArguments;

import static org.hans.demo.CommanderFunctions.configCLI;

public class JobSearch {
    public static void main(String[] args) {

        JCommander jCommander = configCLI("job-search-cli", CLIArguments::new);

        /*
        Stream<HelloWordArgs> streamOfCLI = parseArgs(jCommander, args, JCommander::usage)
                .orElse(Collections.emptyList())
                .stream()
                .map(obj -> (HelloWordArgs) obj);
        */


    }
}