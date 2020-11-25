package by.tc.task01.task1;

public class Task1
{
    public static int getSquare(int number)
    {
        if(number < 0 || number > 9)
        {
            System.out.println("Invalid input!");
            return -1;
        }

        return (int)Math.pow(number, 2) % 10;
    }

}
