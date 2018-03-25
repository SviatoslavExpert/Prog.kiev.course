package Java_00_Extra;

import java.util.Scanner;

public class TaskOne001 {

    public static void main(String[] args) {
        drawPyramid(scan());
    }

    private static int scan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid:");
        return sc.nextInt();
    }

    private static void drawPyramid(int heightStars){
        System.out.println(heightStars);
        int width = 0;
        for(int i = 0; i < heightStars; i++){
            for(int j = 1; j < width; j++) {
                System.out.print("*");
            }
            width += 2;
            System.out.println();
        }
    }
}
