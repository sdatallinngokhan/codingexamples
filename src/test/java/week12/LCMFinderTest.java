package week12;

import org.junit.Assert;
import org.junit.Test;

public class LCMFinderTest {

    @Test
    public void shouldCalculateIsPrime() {
        // given
        LCMFinder lcmFinder = new LCMFinder();
        int number1 = 1;
        int number2 = 2;
        int number3 = 5;
        int number4 = 15;

        // when
        boolean result1 = lcmFinder.isPrime(number1);
        boolean result2 = lcmFinder.isPrime(number2);
        boolean result3 = lcmFinder.isPrime(number3);
        boolean result4 = lcmFinder.isPrime(number4);

        // then
        Assert.assertFalse(result1);
        Assert.assertTrue(result2);
        Assert.assertTrue(result3);
        Assert.assertFalse(result4);
    }

    @Test
    public void shouldGetLCM() {
        // given
        LCMFinder lcmFinder = new LCMFinder();
        int arr[] = {5, 8, 10, 3};
        int expected = 120;

        // when
        int actual = lcmFinder.getLCM(arr);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldHandleEmptyArray() {
        // given
        LCMFinder lcmFinder = new LCMFinder();
        int arr[] = {};
        int expected = 1;

        // when
        int actual = lcmFinder.getLCM(arr);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldHandleOneElementArray() {
        // given
        LCMFinder lcmFinder = new LCMFinder();
        int arr[] = {6};
        int expected = 6;

        // when
        int actual = lcmFinder.getLCM(arr);

        // then
        Assert.assertEquals(expected, actual);
    }

}