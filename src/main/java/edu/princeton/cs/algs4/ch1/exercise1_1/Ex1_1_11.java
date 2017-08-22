package edu.princeton.cs.algs4.ch1.exercise1_1;

/**
 * Created by yan.zhang on 8-20.
 */
public class Ex1_1_11 {

    public static void main(String[] args) {
        boolean[][] booleanArray = new boolean[][] { { true, true, true }, { false, false, false, true } };
        int h=0;
        System.out.print(' ');
        for (boolean b : booleanArray[0]) {
            System.out.print(h++);
        }
        System.out.println();
        for (int j = 0; j < booleanArray.length; j++) {
            System.out.print(j + 1);
            for (int i = 0; i < booleanArray[j].length; i++) {
                if (booleanArray[j][i]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

}
