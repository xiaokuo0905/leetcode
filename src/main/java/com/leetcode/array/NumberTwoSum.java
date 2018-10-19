package com.leetcode.array;

public class NumberTwoSum {


    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int n=i+1;n<nums.length;n++){
                if(nums[i]+nums[n]==target){
                    return new int[]{nums[i],nums[n]};
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] xxx = new int[]{-1,-2,-3,-4,-5};
        int target = -8;
        long start = System.currentTimeMillis();
        int[] test = twoSum(xxx,target);
        System.out.println(test[0]+"+"+test[1]);
        System.out.println(System.currentTimeMillis()-start+"ms");
    }

}
