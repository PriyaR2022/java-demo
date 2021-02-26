package com.priya.examples;

import org.junit.Assert;
import org.junit.Test;
import com.priya.examples.StringRotate;

public class StringRotateTest {

    @Test
    public void test_StrRotate_1() {
        //test with valid input
        String str = "String";
        int shift = 3;
        Assert.assertEquals("ingStr",
                StringRotate.strRotate(str, shift));
    }

    @Test
    public void test_StrRotate_2() {
        // test with invalid input string
        String str = null;
        int shift = 3;
        Assert.assertEquals("invalid_string", StringRotate.strRotate(str, shift));
    }

    @Test
    public void test_StrRotate_3() {
        //test with invalid input string
        String str = "IntelliJ";
        int shift = 0;
        Assert.assertEquals("IntelliJ", StringRotate.strRotate(str, shift));
    }

    @Test
    public void test_StrRotate_4() {
        //test with invalid input string
        String str = "NegativeScenario";
        int shift = -3;
        Assert.assertEquals("invalid_int", StringRotate.strRotate(str, shift));
    }

    @Test
    public void test_StrRotate_5() {
        //test with valid String with space
        String str = "My String";
        int shift = 5;
        Assert.assertEquals("tringMy S",
                StringRotate.strRotate(str, shift));
    }

    @Test
    public void test_StrRotate_6() {
        //test with invalid String and Negative Integer
        String str = "";
        int shift = -1;
        Assert.assertEquals("invalid_string",
                StringRotate.strRotate(str, shift));
    }

    @Test
    public void test_StrRotate_7() {
        //test with invalid String and Negative Integer
        String str = " ";
        int shift = 0;
        Assert.assertEquals(" ",
                StringRotate.strRotate(str, shift));
    }
}