package BeachPractics;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int n=5;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    private static int fibonacci(int n) {

        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
