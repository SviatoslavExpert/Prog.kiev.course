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
/*
Деление по модулю %
Результат деления по модулю - остаток от деления. Например, 7/4 равно 1 с остатком 3. Поэтому 7%4 = 3.
 */

package Java_01_Start;

import java.util.Scanner;

public class task_02_01 {

    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();                           //    54698

        int Remainder1 = (x%10000);                     // 4698
        int Result1 = (x - Remainder1)/10000;           //        5

        int Remainder2 = Remainder1%1000;               //  698
        int Result2 = (Remainder1 - Remainder2)/1000;   //        4

        int Remainder3 = Remainder2%100;                //   98
        int Result3 = (Remainder2 - Remainder3)/100;    //        6

        int Remainder4 = Remainder3%10;                 //    8
        int Result4 = (Remainder3 - Remainder4)/10;     //        9

        int Result5 = Remainder4;                       //        8

        System.out.println(Result1);
        System.out.println(Result2);
        System.out.println(Result3);
        System.out.println(Result4);
        System.out.println(Result5);

        sc.close();
    }
}
