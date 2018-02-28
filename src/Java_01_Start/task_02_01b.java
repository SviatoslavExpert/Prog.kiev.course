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

public class task_02_01b {

    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();                           //    54698

        int Remainder1 = (x%10000);                     // 4698
        int Remainder2 = Remainder1%1000;               //  698
        int Remainder3 = Remainder2%100;                //   98
        int Remainder4 = Remainder3%10;                 //    8

        System.out.println((x - Remainder1)/10000);
        System.out.println((Remainder1 - Remainder2)/1000);
        System.out.println((Remainder2 - Remainder3)/100);
        System.out.println((Remainder3 - Remainder4)/10);
        System.out.println(Remainder4);
    }
}
