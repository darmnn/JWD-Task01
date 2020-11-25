package by.tc.task01.task3;

import org.junit.Assert;
import org.junit.Test;

public class Task3Test
{
    @Test
    public void getSquareTest()
    {
        double actual = Task3.getSquare(45);
        double expected = 22.5;

        Assert.assertEquals(expected, actual, 0.0);

        double actual1 = Task3.getSquare(0);
        double expected1 = -1;

        Assert.assertEquals(expected1, actual1, 0.0);
    }
}
