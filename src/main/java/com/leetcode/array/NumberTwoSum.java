package com.leetcode.array;

import java.util.HashMap;

public class NumberTwoSum {

    /**
     * 1. 两数之和
     *
     * 题目说明:
     *    给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
     *    你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
     *
     * 示例:
     *    给定 nums = [2, 7, 11, 15], target = 9
     *    因为 nums[0] + nums[1] = 2 + 7 = 9
     *    所以 返回 [0, 1]
     *
     * 第一种暴力解题方法: twoSumFirst
     *    遍历2次数据，第1次遍历，找出第一个数 + 第2次遍历 寻找第二个数
     *    如果两数之和等于目标数，返回2个数的位置。
     *
     * 第二种解题方法: twoSumSecond
     *    遍历1次数据，采用hash 列表存放数组的数据和位置， 从hash列表中检索 目标数和元素的差
     */
    public int[] twoSumFirst(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int n = i + 1; n < nums.length; n++) {
                if (nums[i] + nums[n] == target) {
                    return new int[]{i, n};
                }
            }
        }
        return null;
    }
    public int[] twoSumSecond(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-16, -2, 8, -4, -9};
        int target = -8;
        NumberTwoSum test = new NumberTwoSum();
        // 第一种解题方法
        int[] first = test.twoSumFirst(nums, target);
        System.out.println(String.format("第一种解题方法: index:[%s,%s];元素:[%s,%s];结果:[%s]",first[0],first[1],nums[first[0]],nums[first[1]],target));

        // 第二种解题方法
        int[] second = test.twoSumSecond(nums, target);
        System.out.println(String.format("第二种解题方法: index:[%s,%s];元素:[%s,%s];结果:[%s]",second[0],second[1],nums[second[0]],nums[second[1]],target));


    }

}
