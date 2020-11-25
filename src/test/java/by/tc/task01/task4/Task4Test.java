package by.tc.task01.task4;

import org.junit.Assert;
import org.junit.Test;

public class Task4Test
{
    @Test
    public void twoEvenNumbersTest()
    {
        boolean actual = Task4.twoEvenNumbers(4, 5, 33, 987);

        Assert.assertFalse(actual);

        boolean actual1 = Task4.twoEvenNumbers(4, 5, 56, 987);

        Assert.assertTrue(actual1);

        boolean actual2 = Task4.twoEvenNumbers(4, 78, 32, 988);

        Assert.assertTrue(actual2);
    }
}
