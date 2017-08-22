package edu.princeton.cs.algs4.ch1.exercise1_1;

/**
 * Created by yan.zhang on 8-20.
 */
public class Ex1_1_14 {

    public static void main(String[] args) {
        int N = 1025;

        int i = 0, n = 1;
        while (n <= N) {
            n = n * 2;
            i++;
        }
        System.out.println(i - 1);
    }

}
