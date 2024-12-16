package gr.aueb.cf.ch1;

public class AddCalculator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        int result = 0;

        result= add(num1 , num2);


        System.out.println("Sum : " + result);

    }

    static public int add(int a , int b ){
        return a + b;
    }
}
