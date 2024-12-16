package gr.aueb.cf.ch3;

public class MulCalculator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = 0;

        result = mul(num1,num2);

        System.out.println("Mul : " +result);
    }

    static public int mul(int a , int b ) {
        return  a * b;
    }
}
