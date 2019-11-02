package com.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Class Sorting");
        Sorting.runTimeEvaluationAscendingSorting(25, -100, 100);
        Sorting.runTimeEvaluationDescendingSorting(25, -100, 100);

        System.out.println("\nClass Factorial");
        Factorial.runTimeEvaluation((long) 25);

        System.out.println("\nClass Drawing");
        Drawing.drawRectangle(5, 10);
        Drawing.drawTriangle(8, "upper-left");
        Drawing.drawTriangle(8, "bottom-left");
        Drawing.drawTriangle(8, "upper-right");
        Drawing.drawTriangle(8, "bottom-right");
        
    }
}
