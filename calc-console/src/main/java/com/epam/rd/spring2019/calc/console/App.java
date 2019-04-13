package com.epam.rd.spring2019.calc.console;

import com.epam.rd.spring2019.calc.core.CalcImpl;

import java.util.Arrays;

/*
При запуске программы, через переменные окружения будут передаваться следующие аргументы:
number1 number2 operator

Примеры операндов:
100 -100 +

Программа должна вывести в консоль следующее сообщение и завершиться:
number1=100 number2=-100 operator=+ result=0
* */

public class App {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));
        System.out.println(args.length);

        if (args.length == 3) {
            CalcImpl calcImpl = new CalcImpl();
            calcImpl.calculate(args);
        } else {
            System.err.println("Invalid input data! Correct format: number1 number2 operator (+ - x /)");
        }
    }
}
