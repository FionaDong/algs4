package edu.princeton.cs.algs4.ch1.exercise1_1;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by yan.zhang on 8-20.
 */
public class Ex1_1_5 {

    public static void main(String[] args) {
        double[] ary = new double[2];
        int i = 0;
        while (i < 2 && !StdIn.isEmpty()) {
            ary[i++] = StdIn.readDouble();
        }
        boolean result=true;
        for (double v : ary) {
            if (v <= 0 || v >= 1) {
                result=false;
                break;
            }
        }
        System.out.println(result);
    }

}
