/*
Java Start Task 02.03

Написать программу которая вычислит и выведет на экран
длину окружности, если ее радиус считывается с клавиатуры.
*/

package Java_01_Start;

import java.util.Scanner;

public class task_02_03 {

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение радиуса:");
        double radius = sc.nextDouble();
        System.out.println("Длина окружности = " + 2 * Math.PI * radius);
    }
}
