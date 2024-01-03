package org.hans.demo.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIKeywordValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        if (!value.matches("^[a-zA-Z]+[0-9]*$")) {
            String msg = "This character is not allowed, Letters and Numbers are allowed";

            System.err.println(msg);
            throw new ParameterException(msg);
        }
    }
}
