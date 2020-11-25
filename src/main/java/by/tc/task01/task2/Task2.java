package by.tc.task01.task2;

public class Task2
{
    private static boolean isLeap(int year)
    {
        if(year % 4 != 0) return false;
        if(year % 100 != 0) return true;
        if(year % 400 == 0) return true;
        else return false;
    }

    public static int daysInMonth(int year, int month)
    {
        if(month > 12 || month < 1 || year < 1)
        {
            System.out.println("Invalid input!");
            return -1;
        }

        if(month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if(month == 2)
        {
            if(isLeap(year)) return 29;
            else return 28;
        }
        else return 31;
    }

}
