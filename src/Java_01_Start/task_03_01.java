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
        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        System.out.println("Введите второе число:");
        int b = sc.nextInt();
        System.out.println("Введите третье число:");
        int c = sc.nextInt();
        System.out.println("Введите четвертое число:");
        int d = sc.nextInt();

        System.out.println(select(select(a,b), select(c,d)));
    }

    public static int select(int x, int y){
        if (x > y) return x;
        else return y;
    }
}
