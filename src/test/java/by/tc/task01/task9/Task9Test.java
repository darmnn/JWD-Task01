package by.tc.task01.task9;

import org.junit.Assert;
import org.junit.Test;

public class Task9Test
{
    @Test
    public void getSquareTest()
    {
        double actual = Task9.getSquare(12);
        double expected = 452.16;

        Assert.assertEquals(expected, actual, 0.0);

        double actual1 = Task9.getSquare(0);
        double expected1 = -1;

        Assert.assertEquals(expected1, actual1, 0.0);
    }

    @Test
    public void getLengthTest()
    {
        double actual = Task9.getLength(4);
        double expected = 25.12;

        Assert.assertEquals(expected, actual, 0.0);

        double actual1 = Task9.getSquare(0);
        double expected1 = -1;

        Assert.assertEquals(expected1, actual1, 0.0);
    }
}
