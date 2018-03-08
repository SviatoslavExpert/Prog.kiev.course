/*
«Перевернуть массив» (При выполнении задания использовать
дополнительный массив нельзя) - (3 часа)
Было:
(0 0 0 1 1 1
0 0 0 1 1 1
0 0 0 1 1 1
0 0 0 1 1 1
0 0 0 1 1 1
0 0 0 1 1 1)

Стало:
(0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
1 1 1 1 1 1
1 1 1 1 1 1
1 1 1 1 1 1)
 */
package Java_01_Start;

public class task_04_01c {

    public static void main(String[] args) {
        flipArray();
    }

    public static void flipArray() {
        int[][] a = {
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1},
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

            //  rotating the array
            for (int i = 0; i < a.length/2; i++) {
                for (int j = i; j < a.length - 1 - i; j++) {
                    int b = a[i][j];
                    a[i][j] = a[a.length - j - 1][i];
                    a[a.length - j - 1][i] = a[a.length - i - 1][a.length - j - 1];
                    a[a.length - i - 1][a.length - j - 1] = a[j][a.length - i - 1];
                    a[j][a.length - i - 1] = b;
                }
            }
            //  Printing the rotated array
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }

    }
}
