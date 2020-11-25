package by.tc.task01.task6;

public class Task6
{
    public static String timeFromSeconds(int seconds)
    {
        String res = "";

        if(seconds < 0)
        {
            System.out.println("Invalid input!");
            return res;
        }

        Integer hour = seconds/3600;
        Integer minute = (seconds%3600) / 60;
        Integer second = seconds%60;

        res += hour.toString();
        res += ":";
        res += minute.toString();
        res += ":";
        res += second.toString();

        return res;
    }
}
