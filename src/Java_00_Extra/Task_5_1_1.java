/*
Напишите метод который вернет максимальное число из массива целых
чисел.
 */

package Java_00_Extra;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5_1_1 {

    public static void main (String []args){

        // Creating, filling and printing an array
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
        System.out.println("Введите 5 чисел:");
        for(int i = 0; i < 5; i++){ arr[i] = sc.nextInt();}
        System.out.print(Arrays.toString(arr));
        System.out.println();
        // Calling max method and printing what it returns
        System.out.print("Максимальное число данного массива: " + max(arr));
    }

    // Calculating the maximum number
    private static int max(int []arr) {
        int maxNumber = -10000;
        for (int i = 0; i < arr.length; i++) {
            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }
}
