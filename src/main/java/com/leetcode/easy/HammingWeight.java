package com.leetcode.easy;

public class HammingWeight {
    public int hammingWeight(int n) {
        int ones = 0;
        while (n != 0) {
            ones = ones + (n & 1);
            n = n >>> 1;
        }
        return ones;
    }
}
