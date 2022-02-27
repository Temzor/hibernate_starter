package com.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class HammingWeightTest {
    @Test
    public void testOne() {
        HammingWeight hammingWeight = new HammingWeight();
        int input = 00000000000000000000000000001011;
        Assert.assertEquals(3, hammingWeight.hammingWeight(input));
    }

    @Test
    public void testTwo() {
        HammingWeight hammingWeight = new HammingWeight();
        int input = 00000000000000000000000010000000;
        Assert.assertEquals(1, hammingWeight.hammingWeight(input));
    }

    @Test
    public void testThree() {
        HammingWeight hammingWeight = new HammingWeight();
        int input = 00000000000000000000000011001100;
        Assert.assertEquals(4, hammingWeight.hammingWeight(input));
    }
}