package by.tc.task01.task5;

import org.junit.Assert;
import org.junit.Test;

public class Task5Test
{
    @Test
    public void numberIsPerfectTest()
    {
        boolean actual = Task5.numberIsPerfect(496);

        Assert.assertTrue(actual);

        boolean actual1 = Task5.numberIsPerfect(11);

        Assert.assertFalse(actual1);
    }
}
