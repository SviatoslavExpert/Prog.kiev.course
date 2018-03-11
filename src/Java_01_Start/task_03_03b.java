/*
Java Start Task 03.03

Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1). Пользователь
вводит с клавиатуры координаты точки x и y. Написать программу которая
определит лежит ли эта точка внутри треугольника или нет.

Высчитаем значение трех нижеуказанных выражений

где x0,y0 - координаты произвольной точки
Если все три значения одинакового знака, то точка внутри треугольника,
если значение равно нулю, значит точка лежит на стороне треугольника
В ином случае (если значения различные по знаку) , точка вне треугольника.
 */

package Java_01_Start;

import java.util.Scanner;

public class task_03_03b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координату Х");
        double X = sc.nextDouble();
        System.out.print("Введите координату Y");
        double Y = sc.nextDouble();

        double Ax = 0;
        double Ay = 0;
        double Bx = 4;
        double By = 4;
        double Cx = 6;
        double Cy = 1;

        double k1 = (Ax - X) * (By - Ay) - (Bx - Ax) * (Ay - Y);
        double k2 = (Bx - X) * (Cy - By) - (Cx - Bx) * (By - Y);
        double k3 = (Cx - X) * (Ay - Cy) - (Ax - Cx) * (Cy - Y);

        if(k1 > 0 && k2 > 0 && k3 > 0 || k1 < 0 && k2 < 0 && k3 < 0){
            System.out.println("Точка лежит в треугольнике.");
        }
        else if(k1 == 0 && k2 == 0 && k3 == 0){
            System.out.println("Точка лежит на стороне треугольника.");
        }
        else{
            System.out.println("Точка не лежит в треугольнике.");
        }
        sc.close();
    }
}

/*
Математическая часть - векторное и псевдоскалярное произведения.
Реализация - считаются произведения (1, 2, 3 - вершины треугольника, 0 - точка):
(x1 - x0) * (y2 - y1) - (x2 - x1) * (y1 - y0)
(x2 - x0) * (y3 - y2) - (x3 - x2) * (y2 - y0)
(x3 - x0) * (y1 - y3) - (x1 - x3) * (y3 - y0)
Если они одинакового знака, то точка внутри треугольника,
если что-то из этого - ноль, то точка лежит на стороне,
иначе точка вне треугольника.
 */
