package by.tc.task01.task4;

public class Task4
{
    private static boolean isEven(int number)
    {
        return number % 2 == 0;
    }

    public static boolean twoEvenNumbers(int a, int b, int c, int d)
    {
        int counter = 0;

        if(isEven(a)) counter++;
        if(isEven(b)) counter++;
        if(isEven(c)) counter++;
        if(isEven(d)) counter++;

        if(counter > 1) return true;
        else return false;
    }

}
