package ru.max.lesson1;

public class MethodsPractice {

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(7));
        System.out.println(isEven(10));
        System.out.println(max(5, 3));
        System.out.println(max(2, 8));
        System.out.println(max(7, 7));
        countTo(5);
        System.out.println();
        countTo(3);
        System.out.println();
        countFromTo(3, 7);
        System.out.println();
        System.out.println("Сумма от 1 до 5: " + sumTo(5));
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void countTo(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    public static void countFromTo(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }

    public static int sumTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}