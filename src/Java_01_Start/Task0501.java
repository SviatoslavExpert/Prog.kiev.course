package Java_01_Start;

import java.util.Scanner;

public class Task0501 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество полос:");
        int rows = sc.nextInt();
        System.out.println("Введите длину полос:");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++){
            for (int j = 0; j < rows; j++){
                if(j%2 ==0){
                    System.out.print("***");
                }
                else {
                    System.out.print("+++");
                }
            }
            System.out.println();
        }
    }
}
