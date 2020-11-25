package by.tc.task01.task1;

import org.junit.Assert;
import org.junit.Test;

public class Task1Test
{
    @Test
    public void getSqaureTest()
    {
        int actual = Task1.getSquare(7);
        int expected = 9;

        Assert.assertEquals(expected, actual);

        int actual1 = Task1.getSquare(-9);
        int expected1 = -1;

        Assert.assertEquals(expected1, actual1);
    }
}
