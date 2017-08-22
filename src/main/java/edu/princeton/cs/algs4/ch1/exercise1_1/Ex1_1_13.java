package edu.princeton.cs.algs4.ch1.exercise1_1;

/**
 * Created by yan.zhang on 8-20.
 */
public class Ex1_1_13 {

    public static void main(String[] args) {
        int[][] ints = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[j][i]);
            }
            System.out.println();
        }
    }
}
