import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("hi");

//        Calculator calculator = new Calculator(10, 50);
        Calculator calculator = Calculator.create(30, 50);
        System.out.println(calculator.sum());
//        System.out.println(calculator.sum(30, 60));
//        System.out.println(calculator.divide(10F, 3));
//        System.out.println(calculator.power(155, 3));

//        System.out.println(Short.MAX_VALUE);

        int[] a = new int[]{1, 2, 3, 500, 5, 6, 7, 8, 9, 130, 73, 93, 80, 1163};


        ExtendedCalculator ex = new ExtendedCalculator(a);
        ex.doSomting();
        System.out.println(ex.sumArray());
        System.out.println(ex.getMaxArray());


        System.out.println(ex.getMinValue());
        System.out.println(ex.getMinValue());


        // to do

//        min value
//        addade aval00

        Stack<Integer> result = ex.showPrimeNumber();

        System.out.println("Prime number is :");

        for (int x : result) {

            System.out.println(x);

        }

        ex.doSkomting();

        String zz = "hhhh";

        zz = "ggh" + zz;

        System.out.println(zz);

//        to do
//        get  2 number from user and do calculator


        // for array example
//    avrage of array
//
//        tedad tekrar number khas  in arry

//        sub array az flan ta flan
//        array create with scanner
//        and done
//        and done
    }
}