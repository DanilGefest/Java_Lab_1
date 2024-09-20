package org.example;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TaskSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Select task (1-5):");
        System.out.println("1. Task FizzBuzz");
        System.out.println("2. Rotate Arrow");
        System.out.println("3. Square uravneniye");
        System.out.println("4. Sum of ryad");
        System.out.println("5. Test na palendrom");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                fizzBuzzTask(7);
                break;
            case 2:
                reverseStringTask();
                break;
            case 3:
                solveQuadraticEquation(3, 2,1);
                break;
            case 4:
                sumSeries();
                break;
            case 5:
                checkPalindrome();
                break;
            default:
                System.out.println("Neverno.");}
        scanner.close();
    }

    // 1. Задача FizzBuzz
    public static List<String> fizzBuzzTask(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
              //  System.out.println("fizzbuzz");
                result.add("fizzbuzz");
            } else if (i % 5 == 0) {
                //System.out.println("fizz");
                result.add("fizz");
            } else if (i % 7 == 0) {
                result.add("buzz");
               // System.out.println("buzz");
            } else {
                result.add(String.valueOf(i));
                //System.out.println(i);


            }
        }
        return result;
    }

    // 2. Переворот строки
    public static String reverseStringTask() {
        String str = "make install";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
       // System.out.println(reversed);
        return reversed;
    }

    // 3. Решение квадратного уравнения
    public static List<Double> solveQuadraticEquation(double a, double b, double c) {
        Scanner scanner = new Scanner(System.in);
        List<Double> result = new ArrayList<>();
        System.out.println("Paste the koefficents for a, b and c for  ax^2 + bx + c = 0:");
        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            result.add(root1);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            result.add(root2);
            System.out.println("Root: " + root1 + " и " + root2);
        } else {
            System.out.println("Not veshestvenniye roots");
        }
        return result;
    };

    // 4. Сумма ряда
    public static void sumSeries() {
        double epsilon = 1e-6;
        double sum = 0;
        int n = 2;
        double term;

        do {
            term = 1.0 / (n * n + 2 * n);
            sum += term;
            n++;
        } while (term > epsilon);

        System.out.println("Summ: " + sum);
    }

    // 5. Проверка на палиндром
    public static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write string for test word :");
        String input = scanner.next();
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("Palendrom! vse 4etko");
        } else {
            System.out.println("neugadal. popla4");
        }
    }
}
