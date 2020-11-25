package by.tc.task01.task2;

import org.junit.Assert;
import org.junit.Test;

public class Task2Test
{
    @Test
    public void daysInMonthTest()
    {
        int actual = Task2.daysInMonth(2345, 65);
        int expected = -1;

        Assert.assertEquals(expected, actual);

        int actual1 = Task2.daysInMonth(1987, 11);
        int expected1 = 30;

        Assert.assertEquals(expected1, actual1);

        int actual2 = Task2.daysInMonth(2020, 2);
        int expected2 = 29;

        Assert.assertEquals(expected2, actual2);

        int actual3 = Task2.daysInMonth(1007, 8);
        int expected3 = 31;

        Assert.assertEquals(expected3, actual3);
    }
}
