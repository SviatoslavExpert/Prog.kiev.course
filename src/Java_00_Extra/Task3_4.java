/*
Треугольник существует только тогда, когда сумма любых двух его
сторон больше третьей. Дано: a, b, c – стороны предполагаемого
треугольника. Напишите программу которая укажет существует такой
треугольник или нет.
 */
package Java_00_Extra;

import java.util.Scanner;

public class Task3_4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину первой стороны треугольника:");
        double a = sc.nextDouble();
        System.out.println("Введите длину второй стороны треугольника:");
        double b = sc.nextDouble();
        System.out.println("Введите длину третьей стороны треугольника:");
        double c = sc.nextDouble();

        if(a + b > c){
            System.out.println("Треугольник существует.");
        }
        else{
            System.out.println("Треугольник не существует.");
        }
    }
}
