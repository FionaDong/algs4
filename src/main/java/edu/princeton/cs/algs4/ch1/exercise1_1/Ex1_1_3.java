package edu.princeton.cs.algs4.ch1.exercise1_1;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by yan.zhang on 8-20.
 */
public class Ex1_1_3 {

    public static void main(String[] args) {
        int[] ary = new int[3];
        int i = 0;
        while (  i < 3 && !StdIn.isEmpty()) {
            ary[i++] = StdIn.readInt();
        }
        System.out.println(ary[0] == ary[1] && ary[1] == ary[2]);
    }

}
