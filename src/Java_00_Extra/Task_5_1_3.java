/*
Реализуйте метод рисующий на экране прямоугольник из звездочек «*»
— его параметрами будут целые числа которые описывают длину и
ширину такого прямоугольника.
 */

package Java_00_Extra;
import java.util.Scanner;

public class Task_5_1_3 {
    public static void main (String []args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну прямоугольника:");
        int x = sc.nextInt();
        System.out.println("Введите ширину прямоугольника:");
        int y = sc.nextInt();
        sc.close();

        draw(x,y);
    }
    private static void draw(int x, int y){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
