/*
Напишите метод который реализует линейный поиск элемента в массиве.
Если такой элемент в массиве есть то верните его индекс, если нет то
метод должен возвращать число - «-1»
 */

package Java_00_Extra;

public class Task_5_1_4 {
    public static void main(String[] args) {
        int[] arr = {11, 45, 69, 101, 350, 12, 539, 999};
        int arrayElem = 539;
        System.out.println(findIndex(arr, arrayElem));
    }
    private static int findIndex(int[] arr, int arrayElem){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arrayElem) { result = i; }
            else if (result == 0) {result = -1;}
        }
        return result;
     }
}
