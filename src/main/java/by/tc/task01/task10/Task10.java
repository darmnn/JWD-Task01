package by.tc.task01.task10;

import java.util.HashMap;

public class Task10
{
    public static HashMap<Integer, Double> getFunctionValues(int a, int b, int h)
    {
        HashMap<Integer, Double> result = new HashMap<Integer, Double>();

        for(int i = a; i <= b; i += h)
        {
            result.put(i, Math.tan(i));
        }

        return result;
    }

}
