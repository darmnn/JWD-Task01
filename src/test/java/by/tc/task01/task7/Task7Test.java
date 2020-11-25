package by.tc.task01.task7;

import org.junit.Assert;
import org.junit.Test;

public class Task7Test 
{
    @Test
    public void whichIsCloserTest()
    {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(7, -10);
        
        Point expected = p1;
        Point actual = Task7.whichIsCloser(p1, p2);

        Assert.assertEquals(expected, actual);
    }
}
