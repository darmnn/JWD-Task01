package by.tc.task01.task7;

class Point
{
    int x;
    int y;

    Point(int x1, int y1)
    {
        x = x1;
        y = y1;
    }

    double getDistance(int x1, int y1)
    {
        return Math.sqrt(Math.pow(x1 - this.x,2) + Math.pow(y1 - this.y, 2));
    }
}

public class Task7
{
    public static Point whichIsCloser(Point p1, Point p2)
    {
        if(p1.getDistance(0, 0) < p2.getDistance(0, 0))
            return p1;
        else return p2;
    }
}
