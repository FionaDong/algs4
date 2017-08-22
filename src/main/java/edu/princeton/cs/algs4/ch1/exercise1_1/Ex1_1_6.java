package edu.princeton.cs.algs4.ch1.exercise1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by yan.zhang on 8-20.
 */
public class Ex1_1_6 {

    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

}
