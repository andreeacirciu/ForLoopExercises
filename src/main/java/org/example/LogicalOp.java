package org.example;

public class LogicalOp {
    public void countingTo100(int a) {
        for (int i = a; i <= 100; i++) {
            System.out.println(a++);
        }
    }

    public void countingToMinus100(int a) {
        for (int i = a; i >= -100; i--) {
            System.out.println(a--);
        }
    }

    public void countingBetweenNumbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public void countingFromMinToMax(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else if (b < a) {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }
    }

    public void countingEvenNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void countingOddNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public int sumOfNumbers(int a) {
        int sum = 0;
        for (int i = a; i < 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int averageOfNumbers(int a) {
        int sum = 0;
        int numberOfNumbers = 0;
        int average = 0;
        for (int i = a; i <= 100; i++) {
            sum = sum + i;
            numberOfNumbers++;
            average = sum / numberOfNumbers;
        }
        return average;
    }

    public void drawWithStars() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
