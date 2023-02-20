public class Main {
    public static void main(String[] args) {
        counter(8);
        Factorial factorial = new Factorial();
        System.out.println(factorial.fac(10));
    }

    public static void counter(Integer n) {
        if (n == 0)
            return;
        System.out.println(n);
        counter(n - 1);
    }
}