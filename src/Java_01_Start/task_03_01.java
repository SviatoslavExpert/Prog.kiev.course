/*
Java Start Task 03.01

Написать программу которая считывает 4 числа и выводит на экран
самое большое из них.
 */

package Java_01_Start;

import java.util.Scanner;

public class task_03_01 {

    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 4 числа:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(select(select(a,b), select(c,d)));
    }

    public static int select(int x, int y){
        if (x > y) return x;
        else return y;
    }
}
