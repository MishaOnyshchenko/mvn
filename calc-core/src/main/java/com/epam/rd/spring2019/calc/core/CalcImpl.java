package com.epam.rd.spring2019.calc.core;

import com.epam.rd.spring2019.calc.interfaces.Calc;

public class CalcImpl implements Calc {
    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }

    public void calculate(String[] args) {
        double a = 0;
        double b = 0;
        String operator = args[2].toLowerCase();
        double result = 0;

        try {
            a = Double.valueOf(args[0]);
            b = Double.valueOf(args[1]);
        }
        catch (NumberFormatException e){
            System.out.println("Invalid input operand! Allowed only arabic numerals!");
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
                System.out.println("Invalid operator! Correct format: + - x /");
                break;
        }
        System.out.println("number1=" + a + " number2=" + b + " operator=" + operator + " result=" + result);
    }
}
