package Java_00_Extra;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskOne003 {
    public static void main(String[] args){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");

        String text = sdf.format(date);
        System.out.println(text);
    }
}
