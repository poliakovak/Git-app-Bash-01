public class Main {

    public static void main(String[] args) {
        System.out.println("My git app. Super!");

        int a = 5;
        int b = 7;
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }
}
