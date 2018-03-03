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

public class task_04_03 {

    public static void main(String[] args) {

        System.out.println("How much money do you have?");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        String text = String.format("%.2f", num);
        int n = text.indexOf(",");

        char[] t = text.toCharArray();

        String val = "";
        String numt = "";
        for (int i = 0; i < t.length; i++) {

            val = val + "" + t[i];

            if (((n - i) % 3 == 2 && t[i] != '1') || ((n - i) % 3 == -1 && t[i] != '1')) {
                val = t[i] + "0";
            }

            if (!((n - i) % 3 == 2 && t[i] == '1') && !((n - i) % 3 == -1 && t[i] == '1')) {
                numt = numt + "" + toWord(Integer.parseInt(val), i, n);
            }

            if ((n - i) % 3 == 0 || (n - i) % 3 == 1 || ((n - i) % 3 == 2 && t[i] != '1')
                    || ((n - i) % 3 == -1 && t[i] != '1')) {
                val = "";
            }

            if (i == n - 1 && t[i] == '1') {
                numt = numt + "dollar ";
                i++;
            }

            if (i == n - 1 && t[i] != '1') {
                numt = numt + "dollars ";
                i++;
            }

            if (i == n + 2 && t[i] == '1') {
                numt = numt + "cent";
            }

            if (i == n + 2 && t[i] != 1) {
                numt = numt + "cents";
            }

        }

        System.out.println(numt);

        sc.close();

    }

    public static String toWord(int t, int i, int n) {
        String text = " ";

        switch (t) {
            case 1:
                text = "one ";
                break;
            case 2:
                text = "two ";
                break;
            case 3:
                text = "three ";
                break;
            case 4:
                text = "four ";
                break;
            case 5:
                text = "five ";
                break;
            case 6:
                text = "six ";
                break;
            case 7:
                text = "seven ";
                break;
            case 8:
                text = "eight ";
                break;
            case 9:
                text = "nine ";
                break;
            case 10:
                text = "ten ";
                break;
            case 11:
                text = "eleven ";
                break;
            case 12:
                text = "twelve ";
                break;
            case 13:
                text = "thirteen ";
                break;
            case 14:
                text = "fourteen ";
                break;
            case 15:
                text = "fifteen ";
                break;
            case 16:
                text = "sixteen ";
                break;
            case 17:
                text = "seventeen ";
                break;
            case 18:
                text = "eighteen ";
                break;
            case 19:
                text = "nineteen ";
                break;
            case 20:
                text = "twenty ";
                break;
            case 30:
                text = "thirty ";
                break;
            case 40:
                text = "forty ";
                break;
            case 50:
                text = "fifty ";
                break;
            case 60:
                text = "sixty ";
                break;
            case 70:
                text = "seventy ";
                break;
            case 80:
                text = "eighty ";
                break;
            case 90:
                text = "ninety ";
                break;
            default:
                text = "";
        }

        if (t > 0 && n > 0 && (n - i) % 3 == 0) {
            text = text + "hundred ";
        }
        if (t > 0 && n > 0 && i == n - 4) {
            text = text + "thousand ";
        }
        if (t > 0 && n > 0 && i == n - 7) {
            text = text + "million ";
        }

        return text;
    }
}
