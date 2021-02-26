package EstructuraDatos.EjerciciosRecursivos;

public class FibonacciDinamic {

    static int MAX = 51;
    static long[] dp = new long[MAX];

    public static void init() {
        for (int i = 0; i < MAX; i++) {
            dp[i] = -1;
        }
        // Arrays.fills(dp, -1);
    }

    public static long fibo(int n) {
        if (dp[n] != -1) {
            return dp[n];
        }
        if (n == 0) {
            return dp[0] = 0;
        }
        if (n == 1) {
            return dp[1] = 1;
        }
        return dp[n] = fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        init();
        for (int i = 0; i <= 50; i++) {
            System.out.println(i + ":" + fibo(i));
        }

    }
}
