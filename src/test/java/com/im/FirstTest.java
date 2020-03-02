package com.im;

import healthycoderapp.BMICalculator;
import healthycoderapp.Coder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {


    @Test
    void should_return_true_when_pallindrome() {
        //given
        String myStr = "madam";
        //when
        boolean res = new First().isPallindrome(myStr);
        //then
        assertTrue(res);
    }

    @Test
    void should_return_false_when_notpallindrome() {
        //given
        String myStr2 = "hello";
        //when
        boolean res = new First().isPallindrome(myStr2);
        //then
        assertFalse(res);
    }

    @Test
    void should_FilterEvenElements() {
        //given
        List<Integer> elements = new ArrayList<>();
        elements.add(4);
        elements.add(5);
        elements.add(8);
        elements.add(13);

        List<Integer> expected = Arrays.asList(5, 13);

        //when
        List<Integer> evenElements = new First().filterEvenElements(elements);
        //then
        assertIterableEquals(expected, evenElements);

    }

    @Test
    void should_calculateAverage_whenListNotEmpty() {
        //given
        List<BigDecimal> values = new ArrayList<>();
        values.add(new BigDecimal(1));
        values.add(new BigDecimal(7));
        values.add(new BigDecimal(9));
        values.add(new BigDecimal(10));

        BigDecimal expAverage = new BigDecimal(6.75);
        //when
        BigDecimal Average = new First().calculateAverage(values);
        //then
        assertEquals(expAverage, Average);
    }

    @Test
    void should_ThrowRunTimeException_when_ListEmpty() {
        //given
        List<BigDecimal> values = new ArrayList<>();

        //when
        Executable executable = () -> new First().calculateAverage(values);
        //then
        assertThrows(RuntimeException.class, executable);
    }

    @Test
    void should_ThrowRunTimeException_when_ListIsNull() {
        //given
        List<BigDecimal> values = null;

        //when
        Executable executable = () -> new First().calculateAverage(values);
        //then
        assertThrows(RuntimeException.class, executable);
    }
    @Test
    void should_return_string_after_replacement(){
        //given
        String mainStr = "HelloWorld";
        String subStr = "oWo";
        String replacedString = "abc";

        String ExpectedStr = "Hellabcrld";
        //when
        String resultString = new First().replaceSubString(mainStr,subStr,replacedString);
        //then
        assertEquals(ExpectedStr,resultString);
    }


}