package com.leetcode.array;

import java.util.Arrays;

public class MerageSortArray {

    /**
     * 思路:
     *   先依次比较两个数组，按照小的就传入新的数组。
     *   当这次比较完之后可能有一个数组的长度很长，
     *   剩下的数组元素在新数组的末尾插入即可
     *
     * @param a
     * @param b
     * @return
     */

    public static int[] mergeArray(int a[], int b[]) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 5, 7, 8, 10};
        int b[] = {1, 5, 7, 8 };
        int[] ints = mergeArray(a, b);
        System.out.println(Arrays.toString(ints));
    }

}
