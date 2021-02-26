package com.priya.examples;

import org.junit.Assert;
import org.junit.Test;

public class IntegerCountTest {

    @Test
    public void test_intcount1() {
        //test with valid input
        int[] myArray = {1, 2, 3, 4, 5, 6};
        int compare = 3;
        Assert.assertEquals("[3, 2]", IntegerCount.computecount(myArray, compare));
    }

    @Test
    public void test_intcount2() {
        //test with valid input
        int[] myArray = {4, 6, 10, 55, 58, 86, 52};
        int compare = 10;
        Assert.assertEquals("[4, 2]", IntegerCount.computecount(myArray, compare));
    }

    @Test
    public void test_intcount3() {
        //test with Negative input
        int[] myArray = {-1, -2, -3, -4, 5, 6};
        int compare = 1;
        Assert.assertEquals("[2, 4]", IntegerCount.computecount(myArray, compare));
    }

    @Test
    public void test_intcount4() {
        //test with invalid input
        int[] myArray = {};
        int compare = 3;
        Assert.assertEquals("[0, 0]", IntegerCount.computecount(myArray, compare));
    }

    @Test
    public void test_intcount5() {
        //test with valid input
        int[] myArray = {1, 2, 3, 4, 5, 6};
        int compare = 0;
        Assert.assertEquals("[6, 0]", IntegerCount.computecount(myArray, compare));
    }

}