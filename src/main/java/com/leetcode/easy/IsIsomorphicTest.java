package com.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class IsIsomorphicTest {
    @Test
    public void testOne() {
        IsIsomorphic isomorphic  = new IsIsomorphic();
        Assert.assertTrue(isomorphic.isIsomorphic("egg", "add"));
    }

    @Test
    public void testTwo() {
        IsIsomorphic isomorphic  = new IsIsomorphic();
        Assert.assertFalse(isomorphic.isIsomorphic("foo", "bar"));
    }
}