package Java_00_Extra;

import java.util.Scanner;

public class TaskOne001 {

    public static void main(String[] args) {
        drawPyramid(scanWidth());
    }

    private static int scanWidth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the pyramid:");
        return sc.nextInt();
    }

    private static void drawPyramid(int width){

        for (int i = width/2 + 1; i > 0; i--) {
            for (int j = 1; j <= width; j++) {

                if (j >= i && j <= width - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
