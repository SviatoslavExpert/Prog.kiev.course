/*
Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1). -
(При выполнении задания использовать дополнительный массив нельзя)
a[a.length-1] - обращение к последнему элементу массива
 */

package Java_01_Start;

import java.util.Arrays;

public class task_04_02 {

    public static void main(String[] args) {
        //int[] arr = {1,2,3,4};
        int[] arr = new int[4];
        int x = 1;
        for(int i = 0; i < arr.length; i++){
            arr[i] = x;
            x++;
        }
        System.out.println(Arrays.toString(arr));
        rotate(arr);
    }

    static void rotate(int[]a){
        for (int i = 0; i < a.length/2; i++) {
            int b = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - i - 1] = b;
        }
        System.out.println(Arrays.toString(a));
    }
}
