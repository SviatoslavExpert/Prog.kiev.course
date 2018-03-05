/*
Java Start Task 02.01

Написать программу которая считывает 5-и значное число с
клавиатуры и выводит цифры из которого оно состоит.
Например : Считывается число 54698
Выводиться:
5
4
6
9
8
 */

package Java_01_Start;

import java.util.Scanner;

public class task_02_01d {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пятизначное число:");
        int num = sc.nextInt();

        System.out.println(num / 10000);
        System.out.println(num % 10000 / 1000);
        System.out.println(num % 1000 / 100);
        System.out.println(num % 100 / 10);
        System.out.println(num % 10 / 1);
        sc.close();
    }
}
