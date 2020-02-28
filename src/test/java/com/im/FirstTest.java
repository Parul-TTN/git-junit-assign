package com.im;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {
    @Test
    void should_return_true_when_pallindrome()
    {
        //given
        String myStr = "madam";
        //when
        boolean res = new First().isPallindrome(myStr);
        //then
        assertTrue(res);
    }
    @Test
    void should_return_false_when_notpallindrome(){
        //given
        String myStr2  = "hello";
        //when
        boolean res = new First().isPallindrome(myStr2);
        //then
        assertFalse(res);
    }

}