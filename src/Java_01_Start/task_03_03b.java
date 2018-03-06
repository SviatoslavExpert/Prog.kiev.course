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
        //   scanner gets X and Y
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координату Х");
        double x = sc.nextDouble();
        System.out.print("Введите координату Y");
        double y = sc.nextDouble();

        //  getting coordinates of the triangle
        double ax = 0;
        double ay = 0;
        double bx = 4;
        double by = 4;
        double cx = 6;
        double cy = 1;

        //   calculating if the point is inside the triangle
        double k1 = (ax - x) * (by - ay) - (bx - ax) * (ay - y);
        double k2 = (bx - x) * (cy - by) - (cx - bx) * (by - y);
        double k3 = (cx - x) * (ay - cy) - (ax - cx) * (cy - y);

        if(k1>0 && k2>0 && k3>0 || k1<0 && k2<0 && k3<0){
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
Если они одинакового знака, то точка внутри треугольника, если что-то из этого - ноль, то точка лежит на стороне, иначе точка вне треугольника.
 */
