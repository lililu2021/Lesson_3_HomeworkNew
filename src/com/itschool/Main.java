package com.itschool;

import java.util.Scanner;

public class Main<summ> {

    public static void main(String[] args) {
//        Example_1();
//        Example_2();
//        Example_3();
//        Example_4();      // сделано на видео
//        Example_5();
//        Example_6();
//        Example_7();      // сделано на видео
//        Example_8();
        // Example_9();
//        Example_10();
//        Example_11();

    }

    private static void Example_1() {
/*        Составить программу для вычисления значений функции F (x) на отрезке [ a, b]
        с шагом h. Результат представить в виде таблицы, первый столбец которой —
        значения аргумента, второй — соответствующие значения функции.*/

/*//      a) F (x) = x - sin x; Пример

        int a = -2, b = 5;
        double h = 0.1;
        for (double x = a; x <= b; x++) {
            // Используем форматированный вывод с помощью функции String.format()
            System.out.println("x = " + x + " , y = " + String.format("%.3f", x - Math.sin(x)));
        }*/

/*//        b) F (x) = sin^2 x;

        int a = -5, b = 5;
        double h = 0.2;
        for (double x = a; x <= b; x++) {
            double sinx = Math.sin(x);
            System.out.println("x = " + x + " , y = " + String.format("%.3f",Math.pow(sinx,2)));
        }*/

/*//        c) F (x) = 2cosin x-1;

        int a = -10, b = 2;
        double h = 0.3;
        for (double x = a; x <= b; x++) {
            double cosx = Math.cos(x);
            System.out.println("x = " + x + " , y = " + String.format("%.3f", (2 * cosx) - 1));
        }*/
    }

    private static void Example_2() {
       /* Написать программу вычисления функции y=ax^2+b при a = 3; b = -5. Аргумент
        x принимает значения от 1 до 5 с шагом 0,5.*/

        int a = 3, b = -5;
//        double h = 0.5;
        for (double x = 1; x < 5; x = x + 0.5) {
            System.out.println("y = " + String.format("%.3f", Math.pow(x, 2) + b));
        }
    }

    private static void Example_3() {
        /*        *//*Дано натуральное число. Верно ли, что цифра а встречается в нем реже, чем
        цифра b?*//*

        Scanner scanner = new Scanner(System.in);
        String Number = scanner.nextLine();
        int a = 5;
        int b = 3;
        boolean k = Number.contains(a);
        boolean d = Number.contains(b);
        if (k>d) System.out.println("true");
        else {
            System.out.println("false");
        } // Не понимаю, что не так?
    */
    } // неудачная попытка

    private static void Example_4() {
        double x = 0, numerator = 0, denominator = 1, z = 0;
        final int N = 10; // [0...10)
        for (int i = 1; i < 20; i++) {
            denominator = 1;
            for (int k = 1; k < N; k++) {
                x = Math.random() * 10;
                numerator = Math.pow(x, k);
                denominator = denominator * k;
                z += numerator / denominator;
            }
        }
        System.out.println(z);
    }

    private static void Example_5() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double numerator = 0, denominator = 1, z = 0;
        for (double i = 1; i < 15; i++) {
            numerator = x + i;
            denominator = denominator * i;
            z += numerator / denominator;
        }
        System.out.println(z);
    }

    private static void Example_6() {
/*        Составить программу для нахождения всех натуральных решений (х и у)
        уравнения k2 = х2 + у2, где х, у и k лежат в интервале от 1 до 30. Решения, которые
        получаются, перестановкой х и у, считать совпадающими.*/


        double x = Math.random();
        double y = Math.random();

        for (double k = 0; k < 30; k++) {
            double kk = k * k;
            System.out.println(kk);
            for (x = 0; x < 30; x++) {
                for (y = 0; y < 30; y++) {
                    kk = x * x + y * y;
                    System.out.println("k2 = " + kk);
                }
            }
        }
    } // Почему не работает ограничение до 30?

    private static void Example_7() {
//        Найти 15 первых натуральных чисел, делящихся нацело на 19 и больших 100.

        final int N = 15;
        int n = 0, start = 100;
        while (n < N) {
            if (start % 19 == 0) {
                System.out.println(start);
                n++;
            }
            start++;
        }

    }

    private static void Example_8() {
       /* Найти 20 первых натуральных чисел, делящихся нацело на 13 или на 17 и
        больших 500.*/

        final int N = 20;
        int n = 0, start = 500;
        while (n < N) {
            if ((start % 13 == 0) && (start % 17 == 0)) {
                System.out.println(start);
                n++;
            }
            start++;
        }
    }

    private static void Example_10() {
       /* Дана арифметическая прогрессия 1, 5, 9, 13, ... Написать программу
        определения суммы первых десяти ее членов. Вывести значение суммы и всех ее
        слагаемых.*/

        // Как сделать его проще?

        int n = 4;
        int number = 1;
        int number2 = number + n;
        int number3 = number2 + n;
        int number4 = number3 + n;
        int number5 = number4 + n;
        int number6 = number5 + n;
        int number7 = number6 + n;
        int number8 = number7 + n;
        int number9 = number8 + n;
        int number10 = number9 + n;
        int summ = number + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;

        for (number = 1; number < 40; number = number + 4) {
            System.out.println("Значение переменной = " + number);
        }
        System.out.println("Сумма первых 10 чисел арифметической прогресии = "+summ);
    }

    private static void Example_11() {
//  Напишите программы, которые выводят на экран :

//        прямоугольник

/*        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print("[+]");
            }System.out.println();
        }*/
//        прямоугольный треугольник

/*        for (int i = 0; i < 10; i++) {
            for (int j = 0; j != i; j++) {
                System.out.print("[#]");
            } System.out.println();
        }*/
//        равносторонний треугольник


//        ромб



    }
}



