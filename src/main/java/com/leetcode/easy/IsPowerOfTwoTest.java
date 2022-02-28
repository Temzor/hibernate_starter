package com.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class IsPowerOfTwoTest {

    @Test
    public void testOne() {
        IsPowerOfTwo isPowerOfTwo = new IsPowerOfTwo();
        int result  = 16;
        Assert.assertTrue(isPowerOfTwo.isPowerOfTwo(result));
    }

    @Test
    public void testTwo() {
        IsPowerOfTwo isPowerOfTwo = new IsPowerOfTwo();
        int result  = 32;
        Assert.assertTrue(isPowerOfTwo.isPowerOfTwo(result));
    }

    @Test
    public void testThree() {
        IsPowerOfTwo isPowerOfTwo = new IsPowerOfTwo();
        int result  = 9;
        Assert.assertFalse(isPowerOfTwo.isPowerOfTwo(result));
    }

}