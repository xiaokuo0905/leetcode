package com.leetcode.array;

import java.util.Arrays;

public class NumberMaxAndMin {


    public void first(int[] a) {
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max <= a[i]) {
                max = a[i];
            }
            if (min >= a[i]) {
                min = a[i];
            }
        }
        System.out.println("max = " + max + ", min = " + min);
    }

    public void second(int[] a) {
        Arrays.sort(a);
        int max = a[a.length-1];
        int min = a[0];
        System.out.println("max = " + max + ", min = " + min);
    }

    public static void main(String[] args) {

        int[] nums = new int[]{9,16,23,2,3,5,6,1,87,12};
        NumberMaxAndMin number = new NumberMaxAndMin();
        number.first(nums);
        number.second(nums);

    }

}
