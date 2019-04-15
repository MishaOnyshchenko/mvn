package com.epam.rd.spring2019.calc.console;

import com.epam.rd.spring2019.calc.core.CalcImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class App {
    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Application started");
        logger.info("Name: calc");
        logger.info("Version: 1.0");
        logger.info("args length: " + args.length);
        logger.info("args value: " + Arrays.toString(args));

        if (args.length == 3) {
            CalcImpl calcImpl = new CalcImpl();
            logger.info("Calling calcImpl.calculate(args)");
            calcImpl.calculate(args);
            logger.info("calcImpl.calculate(args) passed");
        } else {
            logger.info("Application interrupted. Invalid args.length");
            logger.info("Correct input format: number1 number2 operator(+ - x /)");
            logger.warn("Current value: " + Arrays.toString(args));
            logger.error("Invalid input data: " + Arrays.toString(args));
        }
        logger.info("Application calc 1.0 finished");
    }
}
