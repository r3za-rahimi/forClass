public class Calculator {

    private  Integer a;
    private  Integer b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static Calculator create(int a , int b)
    {
       Calculator c = new Calculator( a ,  b);
        return c;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum(){

        return a+b;

    }


    public int minus(int a , int b){

        return a-b;

    }

    public double divide(float a , int b){

        return (double) a/b;

    }

    public int multiple(int a , int b){

        return a*b;

    }


    public int remain(int a , int b){

        return a%b;

    }


    public long power(int a , int b){

        return (long) Math.pow(a, b);

    }
}
