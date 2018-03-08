/*
Ввести с клавиатуры число (до миллиарда) которое обозначает
количество долларов и центов пользователя. Вывести это количество
прописью. (4 часа)
Например:
How much money do you have?
123,34
You have: one hundred twenty three dollars thirty four cents
 */

package Java_01_Start;

import java.util.Scanner;

public class task_04_03b {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] val = { "million", "thousand", "", "hundred" };

        String[] chislo = { "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty" };

        String[] des = { "twenty", "thirty", "forty", "fifty", "sixty",
                "seventy", "eighty", "ninety" };

        System.out.println("How much money do you have?");
        double chis;
        String resalt = "You have:";
        int i;
        int cent;
        int temp = 0;
        int k = 1000000;


    }
}

/*
% is a symbol for variable

. and the number following modifies how many digit decimal points you want to print

%f string formatting option treats the value as a decimal, and prints it to six decimal places

"%.4f" would print 54.6293
"%.2f" prints 54.63 rounded
 */
