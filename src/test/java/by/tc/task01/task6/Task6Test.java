package by.tc.task01.task6;

import org.junit.Assert;
import org.junit.Test;

public class Task6Test
{
    @Test
    public void timeFromSecondsTest()
    {
        String actual = Task6.timeFromSeconds(76700);
        String expected = "21:18:20";

        Assert.assertEquals(expected, actual);

        String actual1 = Task6.timeFromSeconds(-16);
        String expected1 = "";

        Assert.assertEquals(expected1, actual1);
    }
}
