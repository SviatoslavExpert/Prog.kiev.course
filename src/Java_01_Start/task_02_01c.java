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

public class task_02_01c {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите пятизначное число: ");

        int num = sc.nextInt();
        String text = Integer.toString(num);
        int i = 0;
        int length = Integer.toString(num).length();

        while(i < length){
            char result = text.charAt(i++);
            System.out.println(result);
        }
        sc.close();
    }
}
