import java.util.Stack;

public class ExtendedCalculator {

    private int[] intArrey;

    public ExtendedCalculator(int[] intArrey) {
        this.intArrey = intArrey;
    }

    public void doSomting() {

        System.out.println(intArrey[0]);
    }


    public int sumArray() {

        int sum = 0;
        for (int x : intArrey) {

            sum += x;
        }

        return sum;
    }

    public int getMaxArray() {

        int hightValue = Integer.MIN_VALUE;
        for (int a : intArrey) {
            if (a > hightValue) {

                hightValue = a;
            }


        }
        return hightValue;


    }


    public int getMinValue() {

        Integer min = Integer.MAX_VALUE;

        if (intArrey.length != 0) {


            for (int x : intArrey) {
                if (x < min) {

                    min = x;
                }

            }
        }
        return min;
    }


    public Stack<Integer> showPrimeNumber() {

        Stack<Integer> result = new Stack<>();

        for (int x : intArrey) {

            if (checkPrimeNumber(x)) {

                result.push(x);
            }

        }

        return result;
    }


    private boolean checkPrimeNumber(int num) {

        boolean result = true;
        if (num == 2) {

            return true;

        } else if (num == 0 || num == 1) {


            result = false;

        } else if (num % 2 == 0) {

            result = false;

        } else {

            for (int i = 2; i < ((num+1)/2); i++) {

                if (num % i == 0) {

                    result = false;

                    break;
                }

            }


        }
        return result;

    }


    public void doSkomting(){

        for(int i=0 ; i<10; i++){


            for (int j = 2; j<i+1 ; j++ ){

                System.out.print('*');

            }
            System.out.println();
        }


    }

}
