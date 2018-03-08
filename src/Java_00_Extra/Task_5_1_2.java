/*
Реализуйте метод параметрами которого являются - целое число,
вещественное число и строка. Возвращает он конкатенацию строки с
суммой вещественного и целого числа.
 */

package Java_00_Extra;

public class Task_5_1_2 {
    public static void main (String []args){
        concatenation(3, 5.72, "Word");
    }
    private static void concatenation(int x, double y, String s){
        System.out.print(Double.toString(x + y) + s);
    }
}
