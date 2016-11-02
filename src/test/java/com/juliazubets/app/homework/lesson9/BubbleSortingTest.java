package com.juliazubets.app.homework.lesson9;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


/**
 * Created by Julia Zubets on 11/2/2016.
 */

    public class BubbleSortingTest {

        @Test
        public void bubbleTestMaxToMin() {
            BubbleSorting mybubble = new BubbleSorting();
            int [] expArray = {2, 1};
            int [] numbers = {1, 2};
            String numbersString = Arrays.toString(mybubble.BubbleSortMaxToMin(numbers));
            String expString = Arrays.toString(expArray);
            Assert.assertEquals(expString, numbersString);
        }

    @Test
    public void bubbleTestMinToMax() {
        BubbleSorting mybubble = new BubbleSorting();
        int [] expArray = {2, 3, 7};
        int [] numbers = {7, 2, 3};
        String numbersString = Arrays.toString(mybubble.BubbleSortMinToMax(numbers));
        String expString = Arrays.toString(expArray);
        Assert.assertEquals(expString, numbersString);
    }
}
