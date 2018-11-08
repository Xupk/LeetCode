package com.xupk.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for(int i = 0; i < len ; i ++){
            for(int j=len - 1; j > 0; j --){
                if(i != j && target == nums[i] + nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i ++){
            int key = target - nums[i];
           if(map.containsKey(key) && map.get(key) != i){
               return  new int[]{map.get(key),i};
           }else {
               map.put(nums[i],i);
           }
        }
        throw  new IllegalArgumentException("找不到目标组合");
    }

}
