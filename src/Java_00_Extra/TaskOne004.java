package Java_00_Extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TaskOne004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");  //  описание шаблона для ввода даты
        String dateText = "";
        System.out.println("Input Date:");

        dateText = sc.nextLine();

        try{
           date = sdf.parse(dateText);  //  разбор строки на основании шаблона
        }
        catch(ParseException e){
            System.out.println(e);
        }

        SimpleDateFormat sdfOne = new SimpleDateFormat("dd:MM:yyyy");  //  описание шаблона для вывода даты
        String text = sdfOne.format(date);
        System.out.println(text);
        sc.close();
    }
}
