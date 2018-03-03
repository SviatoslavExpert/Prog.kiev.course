/*
Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1). -
(При выполнении задания использовать дополнительный массив нельзя)
 */

package Java_01_Start;

import java.util.Arrays;

public class task_04_02b {
    public static void main (String []args){
        int []array = {1,2,3,4};
        System.out.println(Arrays.toString(array));
            array[0] = 4;
            array[1] = 3;
            array[2] = 2;
            array[3] = 1;
            System.out.println(Arrays.toString(array));
    }
}
