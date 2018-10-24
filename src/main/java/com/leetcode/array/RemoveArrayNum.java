package com.leetcode.array;

public class RemoveArrayNum {


    /**
     * 删除目标元素
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        RemoveArrayNum sort = new RemoveArrayNum();
        int x =  sort.removeElement(nums,1);
        System.out.println("删除元素后的数组长度:"+x);
        System.out.println("十位数整除:"+15/10);
        System.out.println("十位数模除:"+15%10);
        System.out.println("个位数整除:"+9/10);
        System.out.println("个位数模除:"+9%10);
    }

}
