package ru.max.lesson1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String again = "y";

        while (again.equals("y")) {

            System.out.print("Введите первое число: ");
            double a = sc.nextDouble();

            System.out.print("Введите второе число: ");
            double b = sc.nextDouble();

            System.out.print("Введите операцию (+, -, *, /): ");
            String op = sc.next();

            if (op.equals("+")) {
                System.out.println("Результат: " + (a + b));
            } else if (op.equals("-")) {
                System.out.println("Результат: " + (a - b));
            } else if (op.equals("*")) {
                System.out.println("Результат: " + (a * b));
            } else if (op.equals("/")) {
                if (b == 0) {
                    System.out.println("На ноль делить нельзя");
                } else {
                    System.out.println("Результат: " + (a / b));
                }
            } else {
                System.out.println("Неизвестная операция");
            }

            System.out.print("Еще раз? (y/n): ");
            again = sc.next();
        }

            System.out.println("Программа завершена");
    }
}
