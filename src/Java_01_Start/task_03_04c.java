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

public class task_03_04c {

    public static void main(String[] args) {

        //  Scanning the height (n)
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите максимальную высоту: ");
        int num = sc.nextInt()*2;

        //  Printing the figure
        int j = 0;
        for(int i = 0; i < (num - 1) ;){
            if(j >= (num/2) - Math.abs(num/2 - i)){
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

/*
            if(j >= (num/2 - Math.abs(num/2 - i)))
            {
                System.out.println();
                i++;
                j = 0;
            }
            System.out.print("*");
            j++;
 */
