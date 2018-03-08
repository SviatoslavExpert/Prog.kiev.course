/*
Напишите метод который вернет максимальное число из массива целых
чисел.
 */

package Java_00_Extra;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5_1_1 {

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
        System.out.println("Введите 5 чисел:");

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        /*
        int num = 0;
        int max = -10000;
        for(int i = 0; i < 4; i++){
            num = sc.nextInt();
            if(max < num)
        }
        */
    }
}
