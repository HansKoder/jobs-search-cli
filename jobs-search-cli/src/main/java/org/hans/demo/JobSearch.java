package org.hans.demo;

import com.beust.jcommander.JCommander;
import org.hans.demo.api.APIJobs;
import org.hans.demo.cli.CLIArguments;
import org.hans.demo.cli.CLIFunctions;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static org.hans.demo.CommanderFunctions.configCLI;
import static org.hans.demo.CommanderFunctions.parseArgs;
import static org.hans.demo.api.APIFunctions.buildAPI;

public class JobSearch {
    public static void main(String[] args) {
        System.out.println("cli job search init");
        JCommander jCommander = configCLI("job-search-cli", CLIArguments::newInstance);

        Stream<CLIArguments> streamOfCLI = parseArgs(jCommander, args, JCommander::usage)
                .orElse(Collections.emptyList())
                .stream()
                .map(obj -> (CLIArguments) obj);

        Optional<CLIArguments> optional =
                streamOfCLI.filter(cli -> !cli.isHelp())
                        .filter(cli -> cli.getKeyWord() != null)
                        .findFirst();

        optional.map(CLIFunctions::toMap)
                .map(JobSearch::executeRequest)
                .orElse(Stream.empty())
                .forEach(System.out::println);

    }

    private static Stream<JobPosition> executeRequest (Map<String, Object> params) {
        APIJobs apiJobs = buildAPI(APIJobs.class, "http://localhost:8080");

        return Stream.of(params)
                .map(apiJobs::jobs)
                .flatMap(Collection::stream);
    }
}
