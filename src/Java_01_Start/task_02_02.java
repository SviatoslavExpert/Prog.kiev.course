/*
Java Start Task 02.02

Написать программу которая вычислит и выведет на экран
площадь треугольника если известны его стороны.
*/

package Java_01_Start;

public class task_02_02 {

    public static void main (String []args){
        double a = 0.3;
        double b = 0.4;
        double c = 0.5;
        double p = (a + b + c)/2;
        System.out.println("Площадь треугольника: " + Math.sqrt(p*(p - a)*(p - b)*(p - c)));
    }
}
