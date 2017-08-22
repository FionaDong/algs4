package edu.princeton.cs.algs4.ch1.exercise1_1;
/**
 * Created by yan.zhang on 8-20.
 */
public class Ex1_1_15 {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        int M=10;
        for (int i = 1; i <= M; i++) {
            int count=0;
            for (int anInt : ints) {
                if(anInt==i){
                    count++;
                }
            }
            System.out.print(count);
            
        }
    }

}
