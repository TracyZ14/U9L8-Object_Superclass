public class Point
{
    private String label;
    private int x;
    private int y;

    public Point(String label, int x, int y)
    {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public String toString()
    {
        return("Point " + label + " is at x = " + x + ", y = " + y);
    }

    public boolean equals(Point otherPoint)
    {
        if((x == otherPoint.getX()) && (y == otherPoint.getY()))
        {
            return true;
        }
        return false;
    }
}