/*
Существуют такие последовательности чисел
0,2,4,6,8,10,12
1,4,7,10,13
1,2,4,8,16,32
1,3,9,27
1,4,9,16,25
1,8,27,64,125
Реализуйте программу которая выведет следующий член этой
последовательности (либо подобной им). Например пользователь вводит
строку 0,2,4,6,8,10,12 ответом программы должно быть число 14.
 */
package Java_01_Start;

import java.util.Scanner;

public class task_05_01 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательность чисел:");

        String s = sc.nextLine();
        char[] x = s.toCharArray();
        System.out.println(s);
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i]);
        }
    }
}
