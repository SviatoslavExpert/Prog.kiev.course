/*
Java Start Task 03.04
С помощью цикла нарисовать такую фигуру
*
**
***
****
***
**
*
 */

package Java_01_Start;

import java.util.Scanner;

public class task_03_04b {

    public static void main(String[] args) {
        //  Variables
        int i = 0, j = 0, num;

        //  Scanning the height (n)
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите максимальную высоту: ");
        num = sc.nextInt()*2;

        //  Printing the figure
        for(;i < (num - 1) ;){

            if(j >= (num/2 - Math.abs(num/2 - i)))
            {
                System.out.println();
                i++;
                j = 0;
            }
            System.out.print("*");
            j++;
        }
        sc.close();
    }
}
