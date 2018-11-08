package com.xupk.leetcode.algorithms;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int[2];
        for(int i = 0; i < len ; i ++){
            for(int j=len - 1; j > 0; j --){
                if(i != j && target == nums[i] + nums[j]){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

}
