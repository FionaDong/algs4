package edu.princeton.cs.algs4.ch1.exercise1_1;

/**
 * Created by yan.zhang on 8-21.
 */
public class Ex1_1_19 {

    public static long fibonacci(int N, long[] longs) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        if (longs[N] == 0) {
            longs[N] = fibonacci(N - 1, longs) + fibonacci(N - 2, longs);
        }
        return longs[N];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + fibonacci(i, new long[i + 1]));
        }
    }

}
