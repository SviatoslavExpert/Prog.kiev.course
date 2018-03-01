/*
Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1). -
(При выполнении задания использовать дополнительный массив нельзя)
 */

package Java_01_Start;

public class task_04_02 {
    public static void main (String []args){
        int []array = {1,2,3,4};
        for(int i = 0; i < array.length; i++){
            array[i] = array[array.length - i];
        }
        System.out.println(array[i];);
    }
}
