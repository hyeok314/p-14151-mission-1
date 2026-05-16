package com.back;

public class Calc {
    public static int run(String expression) {
        String[] expBits = expression.split(" \\+ ");

        int num1 = Integer.parseInt(expBits[0]);
        int num2 = Integer.parseInt(expBits[1]);
        return num1 + num2;
    }
}
