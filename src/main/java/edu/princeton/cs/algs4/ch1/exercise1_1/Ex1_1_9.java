package edu.princeton.cs.algs4.ch1.exercise1_1;

/**
 * Created by yan.zhang on 8-20.
 */
public class Ex1_1_9 {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(20));

        String s = "";
        for (int n = 1234; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        System.out.println(s);
    }

}
