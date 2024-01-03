package org.hans.demo.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIHelpValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        if (Boolean.parseBoolean(value) ) {
            throw new ParameterException("The Help was request");
        }
    }
}
