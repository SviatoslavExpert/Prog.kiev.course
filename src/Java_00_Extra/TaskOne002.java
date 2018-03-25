package Java_00_Extra;

import java.util.Scanner;

public class TaskOne002{
    public static void main(String[] args){
        printWord(scanStr());
    }

    private static String scanStr(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }

    private static void printWord(String word){
        System.out.println(word);
    }
}
