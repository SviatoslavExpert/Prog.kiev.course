/*
Java Start Task 03.05
Вычислить с помощью цикла факториал числа - n введенного с
клавиатуры (4<n<16).
 */

package Java_01_Start;

import java.util.Scanner;

public class task_03_05 {

    public static void main (String []args){

        //  Scanning the number
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 4-х до 16:");
        int number = sc.nextInt();

        //  meeting the condition 4 < n < 16
        //  calculating and printing factorial of n
        int x = 1;
        if(number > 4 && number < 16) {
            for (int i = 1; i <= number; i++) {
                x *= i;
            }
            System.out.println("Факториал числа " + number + ": " + x);
        }
        else System.out.println("Неверное число.");
        sc.close();
    }
}
