package com.geektech;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {1.5, 4.8, -7.6, 12.2, 43.1, -84.3, 27.8};
        boolean firstNegativeNumber = false;
        double positiveNumbersSum = 0;
        int positiveNumbersCount = 0;
        for (double number : numbers) {
            if (!firstNegativeNumber && number < 0) {
                firstNegativeNumber = true;
                continue;
            }
            if (firstNegativeNumber && number > 0) {
                positiveNumbersSum += number;
                positiveNumbersCount++;
            }
        }
        System.out.println("for each method: " + positiveNumbersSum / positiveNumbersCount);
        System.out.println("____________________________");
        double[] numbers2 = {1.5, 4.8, -7.6, 12.2, 43.1, -84.3, 27.8};
        boolean firstNegativeNumber2 = false;
        double positiveNumbersSum2 = 0;
        int positiveNumbersCount2 = 0;
        for (int i = 0; i < numbers2.length; i++) {
            if (!firstNegativeNumber2 && numbers2[i] < 0) {
                firstNegativeNumber2 = true;
                continue;
            }
            if (firstNegativeNumber2 && numbers2[i] > 0) {
                positiveNumbersSum2 += numbers2[i];
                positiveNumbersCount2++;
            }
        }
        System.out.println("for method: " + positiveNumbersSum2 / positiveNumbersCount2);
    }
}
