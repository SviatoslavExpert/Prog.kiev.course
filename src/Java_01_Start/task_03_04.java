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

public class task_03_04 {

    public static void main(String []args){
        for (int i = 1; i < 8; i++){
            switch(i){
                case 1:
                    System.out.println("*");
                    break;
                case 2:
                    System.out.print("*"); System.out.println("*");
                    break;
                case 3:
                    System.out.print("*"); System.out.print("*"); System.out.println("*");
                    break;
                case 4:
                    System.out.print("*"); System.out.print("*"); System.out.print("*"); System.out.println("*");
                    break;
                case 5:
                    System.out.print("*"); System.out.print("*"); System.out.println("*");
                    break;
                case 6:
                    System.out.print("*"); System.out.println("*");
                    break;
                case 7:
                    System.out.println("*");
                    break;
            }
        }
    }
}
