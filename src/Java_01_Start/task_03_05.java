/*
Java Start Task 03.05

Вычислить с помощью цикла факториал числа - n введенного с
клавиатуры (4<n<16).
 */

package Java_01_Start;

import java.util.Scanner;

public class task_03_05 {

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 4-х до 16:");
        int count = sc.nextInt();
        if(count > 4 && count <16) {
            int x = 1;

            for (int i = 1; i <= count; i++) {
                x = x * i;
            }
            System.out.println(x);
        }
        else System.out.println("Неверное число.");
        sc.close();
    }
}
