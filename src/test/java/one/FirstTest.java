package one;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest {

    @Test
    public void getAverageFibonacci_InputIsOne_ReturnsOne() {
        int result = First.getAverageFibonacci(1);
        Assert.assertEquals(1,result);
    }
    @Test
    public void getAverageFibonacci_InputIsTwo_ReturnsOne() {
        int result = First.getAverageFibonacci(2);
        Assert.assertEquals(1,result);
    }

    @Test
    public void getAverageFibonacci_InputIsThree_ReturnsOne() {
        int result = First.getAverageFibonacci(3);
        Assert.assertEquals(1,result);
    }

    @Test
    public void getAverageFibonacci_InputIsFour_ReturnsOne() {
        int result = First.getAverageFibonacci(4);
        Assert.assertEquals(1,result);
    }

    @Test
    public void getAverageFibonacci_InputIsFive_ReturnsTwo() {
        int result = First.getAverageFibonacci(5);
        Assert.assertEquals(2,result);
    }

    @Test
    public void getAverageFibonacci_InputIsSix_ReturnsThree() {
        int result = First.getAverageFibonacci(6);
        Assert.assertEquals(3,result);
    }
}