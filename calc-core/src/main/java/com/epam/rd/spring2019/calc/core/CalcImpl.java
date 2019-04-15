package com.epam.rd.spring2019.calc.core;

import com.epam.rd.spring2019.calc.interfaces.Calc;
import org.slf4j.*;

public class CalcImpl implements Calc {
    private static final Logger logger = LoggerFactory.getLogger(CalcImpl.class);

    @Override
    public double addition(double a, double b) {
        logger.info("addition runs");
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        logger.info("subtraction runs");
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        logger.info("multiplication runs");
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        logger.info("division runs");
        return a / b;
    }

    public void calculate(String[] args) {
        logger.info("calculate runs");

        double a = 0;
        double b = 0;
        String operator = args[2].toLowerCase();
        double result = 0;

        try {
            a = Double.valueOf(args[0]);
            b = Double.valueOf(args[1]);
        }
        catch (NumberFormatException e){
            logger.info("Application interrupted. Allowed only arabic numerals!");
            logger.warn("Invalid input operand!");
            logger.error("Invalid input operand(s). Received value: a=" + args[0] + ", b=" + args[1]);
            return;
        }

        switch (operator) {
            case "+":
                result = addition(a, b);
                break;
            case "-":
                result = subtraction(a, b);
                break;
            case "x":
                result = multiplication(a, b);
                break;
            case "/":
                result = division(a, b);
                break;
            default:
                logger.warn("Input operator: " + operator);
                logger.error("Invalid operator. Correct format: + - x /");
                break;
        }

        System.out.println("number1=" + a + " number2=" + b + " operator=" + operator + " result=" + result);
    }
}
