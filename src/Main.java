public class Main {

    public static void main(String[] args) {

        System.out.println("App calculator");
        System.out.println("Version 1.0");

        int a = 5;
        int b = 7;

        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
        int e = subtract(a, b);
        System.out.println(e);
        int f = divide(a, b);
        System.out.println(f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
