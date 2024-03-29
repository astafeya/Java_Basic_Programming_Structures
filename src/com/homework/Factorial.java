package com.homework;

public class Factorial {
    public static void runTimeEvaluation(long value) {
        long startTime;
        long estimatedTime;
        long result1;
        long result2;

        startTime = System.nanoTime();
        result1 = Factorial.cyclicFactorial(value);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("cyclicFactorial: " + estimatedTime);

        startTime = System.nanoTime();
        result2 = Factorial.recursiveFactorial(value);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("recursiveFactorial: " + estimatedTime);
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
