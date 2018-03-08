/*
Существует массив {1,2,3,4,5}. Напишите программу которая выведет на
экран все возможные комбинации из этих цифр. Внимание повторений
быть не должно.
 */

package Java_01_Start;

import java.util.Arrays;

public class task_05_03 {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println();

        System.out.println("Array combinations:");
        permute(arr,arr.length);
    }

    private static void permute(int[] arr, int size) {
        if (size<2){
            System.out.println(Arrays.toString(arr));
        }else{
            for (int k = 0; k <size ; k++) {
                swap(arr,k,size - 1);
                permute(arr,size - 1);
                swap(arr,size - 1,k);
            }
        }
    }

    private static void swap(int[] arr, int k, int i) {
        int tmp = arr[k];
        arr[k] = arr[i];
        arr[i] = tmp;
    }
}
