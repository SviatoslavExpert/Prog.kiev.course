/*
Напишите метод который реализует линейный поиск элемента в массиве.
Если такой элемент в массиве есть то верните его индекс, если нет то
метод должен возвращать число - «-1»
 */

package Java_00_Extra;
import java.util.Arrays;

public class Task_5_1_4 {
    public static void main(String[] args) {
        int[] arr = {11, 45, 69, 101, 350, 12, 539, 999};
        //System.out.println(Arrays.asList(arr).indexOf("539"));
        System.out.println(findIndex(arr));
    }
    public static int findIndex(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 350) { return i; }
            else { return -1;}
        }
     }
}

//  for(int i : arr)
