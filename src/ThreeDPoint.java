public class ThreeDPoint extends Point
{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z)
    {
        super(label, x, y);
        this.z = z;
    }

    public int getZ()
    {
        return z;
    }

    public String toString()
    {
        return(super.toString() + ", z = " + z);
    }

    public boolean equals(ThreeDPoint otherThreeDPoint)
    {
        if((super.getX() == otherThreeDPoint.getX()) && (super.getY() == otherThreeDPoint.getY()) && (z == otherThreeDPoint.getZ()))
        {
            return true;
        }
        return false;
    }
}