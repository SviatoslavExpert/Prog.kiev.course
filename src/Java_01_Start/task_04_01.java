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

import java.util.Arrays;

public class task_04_01 {

    public static void main(String[] args) {

        //   Creating and filling an array
        int[][] a = new int[6][6];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length/2; j++) {
                a[i][j] = 0;
            }
            for (int j = a[i].length/2; j < a[i].length; j++) {
                a[i][j] = 1;
            }
            System.out.println();
        }

        //   Printing an array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        rotateArray(a);
    }


    //   Rotating the array
    static void rotateArray(int[][]a){
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





/*
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = i + j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
 */

/*
int[][]a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = j+1;
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
 */
