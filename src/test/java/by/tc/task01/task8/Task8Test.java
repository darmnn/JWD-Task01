package by.tc.task01.task8;

import org.junit.Assert;
import org.junit.Test;

public class Task8Test
{
    @Test
    public void getFunctionValueTest()
    {
        double actual = Task8.getFunctionValue(6);
        double expected = -9;

        Assert.assertEquals(expected, actual, 0.0);

        double actual1 = Task8.getFunctionValue(1);
        double expected1 = -0.2;

        Assert.assertEquals(expected1, actual1, 0.0);
    }
}
