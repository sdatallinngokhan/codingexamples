package week12;

import org.junit.Assert;
import org.junit.Test;

public class SecondBiggestOfAnArrayTest {

    @Test
    public void shouldGetSecondBiggestElementFromAGivenArray(){
        // given
        SecondBiggestOfAnArray secondBiggestOfAnArray = new SecondBiggestOfAnArray();
        int arr[] = {65, 2, 16, 15, 4, 12, 65};
        int expected = 65;

        // when
        int actual = secondBiggestOfAnArray.getSecondBiggest(arr);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldHandle1ElementCase(){
        // given
        SecondBiggestOfAnArray secondBiggestOfAnArray = new SecondBiggestOfAnArray();
        int arr[] = {8};
        int expected = 8;

        // when
        int actual = secondBiggestOfAnArray.getSecondBiggest(arr);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldHandleEmptyArray(){
        // given
        SecondBiggestOfAnArray secondBiggestOfAnArray = new SecondBiggestOfAnArray();
        int arr[] = {};
        int expected = -1;

        // when
        int actual = secondBiggestOfAnArray.getSecondBiggest(arr);

        //then
        Assert.assertEquals(expected, actual);
    }

}