public class MethodsDemo {

    //Method without return value

    public static void greet () {
        System.err.println("Hello Battu");
    }

    //Method with parameters
    public static void add (int a, int b) {
        int result = a+b;
        System.out.println("Sum: " + result);
    }

    //Method with return value
    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        greet();
        add (7,8);

        int answer = multiply(6,7);
   
   System.out.println("Multiplication Result: " + answer);
    }
}