package Java_00_Extra;

public class Example01 {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("Значение переменной в главном методе до вызова sum - " + a);
        System.out.println("Результат вызова метода sum - " + sum(a,b));
        System.out.println("Значение переменной в главном методе после вызова sum - " + a);
    }
    static int sum(int a,int b){
        a = a + 3;
        System.out.println("Значение а в методе sum - " + a);
        return a + b;
    }
}
