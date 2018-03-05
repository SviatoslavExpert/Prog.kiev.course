/*
Java Start Task 03.01

Написать программу которая считывает 4 числа и выводит на экран
самое большое из них.
 */

package Java_01_Start;

import java.util.Scanner;

public class task_03_01b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = sc.nextInt();
        System.out.println("Введите число b");
        int b = sc.nextInt();
        System.out.println("Введите число c");
        int c = sc.nextInt();
        System.out.println("Введите число d");
        int d = sc.nextInt();

        System.out.println("Самое большое число: " + Math.max(Math.max(a, b), Math.max(c, d)));
        sc.close();
    }
}
