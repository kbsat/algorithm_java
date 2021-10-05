package dp;

import java.util.Arrays;

public class fibonacci {
    public static void main(String[] args) {

        long[] mem = new long[100];

        System.out.println(fibonacci(99, mem));

    }

    private static long fibonacci(int n, long[] mem) {
        if (n == 1 || n == 2) {
            return 1;
        }

        if (mem[n] != 0) {
            return mem[n];
        } else {
            mem[n] = fibonacci(n - 2, mem) + fibonacci(n - 1, mem);
            return mem[n];
        }
    }

    private static long fibonacciBottomUp(int n, long[] mem) {
        mem[1] = 1;
        mem[2] = 2;

        for (int i = 3; i <= n; i++) {
            mem[i] = mem[i - 1] + mem[i - 2];
        }

        return mem[n];
    }
}
