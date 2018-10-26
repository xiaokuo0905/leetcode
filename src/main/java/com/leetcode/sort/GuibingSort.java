package com.leetcode.sort;


import java.util.Arrays;

/**
 * https://zh.wikipedia.org/wiki/%E5%BD%92%E5%B9%B6%E6%8E%92%E5%BA%8F
 *
 * 思想：基于合并,将两个或两个以上有序表合并成一个新的有序表.
 *
 * 假设初始序列含有n个记录,首先将这个n个记录看成n个有序子序列,每个序列的长度为1,然后两两归并,并得到n/2个长度为2的有序子序列.
 * 再对长度为2的有序子序列进行两两归并.
 * 如此重复,直到有序为止.
 */
public class GuibingSort {

    static void mergeSort(int[] a, int[] tmpArray, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tmpArray, left, center);
            mergeSort(a, tmpArray, center + 1, right);
            merge(a, tmpArray, left, center + 1, right);
        }
    }

    static void mergeSort(int a[]) {
        int[] tmpArray = new int[a.length];
        mergeSort(a, tmpArray, 0, a.length - 1);
    }

    static void merge(int[] a, int[] tmpArray, int lefPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = lefPos;
        int numElements = rightEnd - lefPos + 1;

        while (lefPos <= leftEnd && rightPos <= rightEnd) {
            if (a[lefPos] <= a[rightPos]) {
                tmpArray[tmpPos++] = a[lefPos++];
            } else {
                tmpArray[tmpPos++] = a[rightPos++];
            }
        }

        while (lefPos <= leftEnd) {
            tmpArray[tmpPos++] = a[lefPos++];
        }

        while (rightPos <= rightEnd) {
            tmpArray[tmpPos++] = a[rightPos++];
        }

        for (int i = 0; i < numElements; i++, rightEnd--) {
            a[rightEnd] = tmpArray[rightEnd];
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 10, 4, 6, 8, 13, 15};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }


}