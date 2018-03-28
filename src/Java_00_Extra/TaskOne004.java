package Java_00_Extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TaskOne004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
        String dateText = "";
        System.out.println("Inout Date:");

        dateText = sc.nextLine();

        try{
           date = sdf.parse(dateText);
        }
        catch(ParseException e){
            System.out.println(e);
        }
    }
}
