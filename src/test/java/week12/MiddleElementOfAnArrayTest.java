package week12;

import org.junit.Assert;
import org.junit.Test;

public class MiddleElementOfAnArrayTest {

    @Test
    public void shouldHandleOddArrays() {
        // given
        MiddleElementOfAnArray middleElementOfAnArray = new MiddleElementOfAnArray();
        int arr[] = {2, 16, 15, 4, 12, 65, 3};
        String expected = "12";

        // when
        String actual = middleElementOfAnArray.getMiddleElement(arr);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldHandleEvenArrays() {
        // given
        MiddleElementOfAnArray middleElementOfAnArray = new MiddleElementOfAnArray();
        int arr[] = {2, 16, 15, 4, 12, 65, 3, 9};
        String expected = "9 and 12";

        // when
        String actual = middleElementOfAnArray.getMiddleElement(arr);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldHandleEmptyArrays() {
        // given
        MiddleElementOfAnArray middleElementOfAnArray = new MiddleElementOfAnArray();
        int arr[] = {};
        String expected = "";

        // when
        String actual = middleElementOfAnArray.getMiddleElement(arr);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldHandle1ElementCase() {
        // given
        MiddleElementOfAnArray middleElementOfAnArray = new MiddleElementOfAnArray();
        int arr[] = {7};
        String expected = "7";

        // when
        String actual = middleElementOfAnArray.getMiddleElement(arr);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldHandle2ElementCase() {
        // given
        MiddleElementOfAnArray middleElementOfAnArray = new MiddleElementOfAnArray();
        int arr[] = {7,8};
        String expected = "7 and 8";

        // when
        String actual = middleElementOfAnArray.getMiddleElement(arr);

        // then
        Assert.assertEquals(expected, actual);
    }
}