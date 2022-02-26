package com.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class ReverseBitsTest {

    @Test
    public void testOne() {
        ReverseBits reverseBits = new ReverseBits();
        int input  = 43261596;
        Assert.assertEquals(964176192, reverseBits.typeReverseBits(input));
    }

    @Test
    public void testTwo() {
        ReverseBits reverseBits = new ReverseBits();
        int input  = 964176192;
        Assert.assertEquals(43261596, reverseBits.typeReverseBits(input));
    }
}