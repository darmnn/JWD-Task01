package by.tc.task01.task10;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class Task10Test
{
    @Test
    public void getFunctionValuesTest()
    {
        HashMap<Integer, Double> actual = Task10.getFunctionValues(2, 9, 3);
        HashMap<Integer, Double> expected = new HashMap<Integer, Double>();

        expected.put(2, -2.185039863261519);
        expected.put(5, -3.380515006246586);
        expected.put(8, -6.799711455220379);

        Assert.assertEquals(expected, actual);
    }
}

