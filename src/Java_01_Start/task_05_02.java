/*
Число-палиндром с обеих сторон (справа налево и слева направо)
читается одинаково. Самое большое число-палиндром, полученное
умножением двух двузначных чисел – 9009 = 91 × 99.
Найдите самый большой палиндром, полученный умножением двух
трехзначных чисел.
 */

package Java_01_Start;

public class task_05_02 {

    static int ObratChislo(int n) //метод для получения "обратного" числа - для 1234 вернет 4321
    {
        int obr = 0;
        while (n > 0)
        {
            obr = 10 * obr + n % 10;
            n /= 10;
        }
        return obr;
    }

    public static void main(String[] args)
    {
        int otv = 0;
        int[] m = new int[999 * 999]; //в этом массиве будут все палиндромы
        int u = 0;
        for (int i = 999; i > 1; --i)
        {
            for (int j = 999; j > 1; --j)
            {
                otv = i * j; // то самое произведения
                if (otv == ObratChislo(otv)) // проверяем на "палиндромность"
                {
                    m[u] = otv; //пишем в массив
                    ++u;        //увеличиваем индекс массива
                    break;      //завершаем цикл
                }
            }
        }
        otv = m[0];   //ищем макс. элемент массива
        for (int i = 1; i < m.length; ++i)
        {
            if (m[i]> otv) otv = m[i];
        }
        System.out.println(otv);
    }
}
