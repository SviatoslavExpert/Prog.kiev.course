/*
Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1). -
(При выполнении задания использовать дополнительный массив нельзя)
 */

package Java_01_Start;

import java.util.Arrays;

public class task_04_02 {
    public static void main (String []args){
        int []array = {1,2,3,4};
        System.out.println(Arrays.toString(array));
        //int x = array.length;
        for(int i = 0; i < array.length; i++){
            //System.out.println(array[array.length]);
            //System.out.print(array[i]);
            array[i] = array[array.length - i - 1];
            System.out.print(array[i]);
            System.out.print(" ");
            System.out.print(i);
            System.out.println();
        }
           System.out.println(Arrays.toString(array));
           //System.out.println(array[i]);
            //Выводит в консоль массив
        System.out.println(array[array.length-1]);
    }
}
