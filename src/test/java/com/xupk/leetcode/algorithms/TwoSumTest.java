package com.xupk.leetcode.algorithms;

import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class TwoSumTest {

    private  static  TwoSum twoSum;

    @BeforeClass
    public static void setUp(){
        twoSum = new TwoSum();
    }


    @org.junit.Test
    public void twoSum() throws Exception {
        assertArrayEquals(twoSum.twoSum(new int[] {1,2,3,4},3),new int[]{0,1});
    }

    @org.junit.Test
    public void twoSum2() throws Exception {
        assertArrayEquals(twoSum.twoSum2(new int[] {1,2,3,4},3),new int[]{0,1});
    }

}