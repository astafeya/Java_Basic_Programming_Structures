package com.homework;

public class OneDimensionalArrays {
    public static int[] createRandomArray(int size, int minValue, int maxValue) {
        if (size <= 0) size = 10;
        int[] array = new int[size];
        int max = maxValue - minValue;
        if (minValue == 0) {
            maxValue = 0;
        }
        else if (minValue > 0) {
            maxValue = -minValue;
        }

        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.round((Math.random() * max) - maxValue);
        }
        return array;
    }

    public static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static int[] createOddNumbersArray(int startValue, int finishValue) {
        int size = (finishValue + 1) / 2 - (startValue - 1) / 2;
        int[] array = new int[size];

        for (int i = 0, v = startValue; i < array.length; i++, v+=2) {
            array[i] = v;
        }

        return array;
    }

    public static String countOddAndEvenElements(int[] array) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        
        return "Odd elements: " + odd + "\nEven elements: " + even;
    }

    public static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[maxIndex] <= array[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int findMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[minIndex] >= array[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static String findMaxAndMin(int[] array) {
        int maxIndex = findMaxIndex(array);
        int minIndex = findMinIndex(array);

        return "MaxElement: " + array[maxIndex] + "\nMaxIndex: " + maxIndex +
                "\nMinElement: " + array[minIndex] + "\nMinIndex: " + minIndex;
    }

    public static double findAvarage(int[] array) {
        double avarage = 0.0;
        for (int i = 0; i < array.length; i++) {
            avarage += array[i];
        }
        avarage /= array.length;
        return avarage;
    }

    public static String compareAvarage(int[] array1, int[] array2) {
        double avarage1 = findAvarage(array1);
        double avarage2 = findAvarage(array2);
        if (avarage1 == avarage2)
            return "Avarages is equal";
        return (avarage1 > avarage2)? "Avarage of array 1 is more" : "Avarage of array 2 is more";

    }

    public static int[] findMostCommonElement(int[] array) {
        int[] answerElements = new int[array.length];
        int answerLenght = 0;
        int maxCount = 1;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    if (count == maxCount) {
                        answerElements[answerLenght] = array[i];
                        answerLenght++;
                    }
                    else if (count > maxCount) {
                        maxCount = count;
                        answerLenght = 1;
                        answerElements[0] = array[i];
                    }
                }
            }
        }

        int[] answer = new int[answerLenght];
        for (int i = 0; i < answerLenght; i++) {
            answer[i] = answerElements[i];
        }
        return answer;
    }

    public static void replaceOddIndexes(int[] array, int value) {
        for (int i = 1; i < array.length; i+= 2) {
            array[i] = value;
        }
    }

}
