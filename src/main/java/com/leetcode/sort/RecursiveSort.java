package com.leetcode.sort;

import java.util.Arrays;

public class RecursiveSort {

    /***
     * 递归版本
     */
    static void recursive(int[] arr, int[] result, int start, int end) {

        if (start >= end)
            return;

        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;

        recursive(arr, result, start1, end1);
        recursive(arr, result, start2, end2);

        int k = start;
        while (start1 <= end1 && start2 <= end2)
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];

        while (start1 <= end1)
            result[k++] = arr[start1++];

        while (start2 <= end2)
            result[k++] = arr[start2++];

        for (k = start; k <= end; k++)
            arr[k] = result[k];
    }

    /***
     * 递归版本
     */
    public static void merge_sort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        recursive(arr, result, 0, len - 1);
    }


    /**
     * 迭代版本
     */
    public static void merge_sort_2(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        int block, start;

        // 原版代码的迭代次数少了一次，没有考虑到奇数列数组的情况
        for (block = 1; block < len; block *= 2) {
            for (start = 0; start < len; start += 2 * block) {
                int low = start;
                int mid = (start + block) < len ? (start + block) : len;
                int high = (start + 2 * block) < len ? (start + 2 * block) : len;
                //两个块的起始下标及结束下标
                int start1 = low, end1 = mid;
                int start2 = mid, end2 = high;
                //开始对两个block进行归并排序
                while (start1 < end1 && start2 < end2) {
                    result[low++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
                }
                while (start1 < end1) {
                    result[low++] = arr[start1++];
                }
                while (start2 < end2) {
                    result[low++] = arr[start2++];
                }
            }
            int[] temp = arr;
            arr = result;
            result = temp;
        }
        result = arr;
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 10, 4, 6, 8, 13, 15};
        merge_sort(a);
        System.out.println(Arrays.toString(a));
    }

}
