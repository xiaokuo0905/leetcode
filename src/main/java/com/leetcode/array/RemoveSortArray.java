package com.leetcode.array;

public class RemoveSortArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        RemoveSortArray sort = new RemoveSortArray();
        int i =  sort.removeDuplicates(nums);
        System.out.println(i);

    }
}
