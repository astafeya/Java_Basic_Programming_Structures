package com.homework;

public class Factorial {
    public static void runTimeEvaluation(long value) {

    }

    public static long cyclicFactorial(long value) {
        long result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    public static long recursiveFactorial(long value) {
        if (value == 1) {
            return 1;
        }
        return value * recursiveFactorial(value - 1);
    }
}
