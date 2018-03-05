/*
Java Start Task 03.02

Есть круг с центром в начале координат и радиусом 4. Пользователь
вводит с клавиатуры координаты точки x и y. Написать программу которая
определит лежит ли эта точка внутри круга или нет.
 */

package Java_01_Start;

import java.util.Scanner;

public class task_03_02 {

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение координаты X точки:");
        double x = sc.nextDouble();
        System.out.println("Введите значение координаты Y точки:");
        double y = sc.nextDouble();

        double result = Math.sqrt((x * x) + (y * y));
        double radius = 4;

        if (result > radius) System.out.println("Точка лежит вне круга.");
        else System.out.println("Точка лежит внутри круга.");
        sc.close();
    }
}
