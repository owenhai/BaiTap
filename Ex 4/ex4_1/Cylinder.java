package ex4_1;

public class Cylinder extends Circle
{
    private double height = 1.0;

    public Cylinder(){}

    public Cylinder(double radius)
    {
        super(radius);
    }

    public Cylinder(double radius, double height)
    {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color)
    {
        super(radius, color);
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getVolume()
    {
        return getArea() * height;
    }

    @Override
    public double getArea()
    {
        return 2*3.14*getRadius()*height + 2*super.getArea();
    }

    @Override
    public String toString()
    {
        return "ex4_1.Cylinder: subclass of " + super.toString() + "height=" + height;
    }
}

