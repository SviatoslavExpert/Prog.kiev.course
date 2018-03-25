package Java_00_Extra;

import java.util.Scanner;

public class TaskOne001 {

    public static void main(String[] args) {
        drawPyramid(scan());
    }

    private static int scan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid:");
        int height = sc.nextInt();
        return height;
    }

    private static void drawPyramid(int heightStars){
        for(int i = 0; i < heightStars; i++){
            for(int j = 0; j < heightStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//