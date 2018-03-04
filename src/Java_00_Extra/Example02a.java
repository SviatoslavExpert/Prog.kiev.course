

package Java_00_Extra;

public class Example02a {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,67,8};
        System.out.println("Значение переменной в главном методе до вызова sum - ");
        for(int k:a){System.out.print(k+" ");}
        System.out.println();

        sum(a);

        System.out.println();
        System.out.println("Значение переменной в главном методе после вызова sum - ");
        for(int k:a){System.out.print(k+" ");}
    }
    static void sum(int[]a){
        a[3] = a[3] + 3;
        System.out.println("Значение а в методе sum - ");
        for(int k:a){System.out.print(k+" ");}
    }
}
