package com.leetcode.sort;


import java.util.Arrays;

/**
 * 冒泡排序方法
 */
public class BubbleSort {

    public static void bubbleSort(int a[]) {

        boolean change = true;
        for (int i = 1; i <= a.length - 1 && change; i++) {
            change = false;
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    change = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 2, 5, 8, 6, 88, 11, 55, 22, 33, 99, 76};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

}
