package edu.princeton.cs.algs4.ch1.exercise1_1;

/**
 * Created by yan.zhang on 8-21.
 */
public class Ex1_1_20 {

    public static void main(String[] args) {
        System.out.println(getLn(10));
    }

    public static double getLn(double n) {
        if (n == 1D) {
            return 0D;
        }
        return Math.log(n) + getLn(n - 1);
    }
}
