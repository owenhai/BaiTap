public class Circle
{
    private double radius;
    private String color;
    public Circle()
    {
        radius = 1.0;
        color = "red";

    }
    public Circle(double r)
    {
        radius = r;
        color = "red";
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
    public String toString()
    {
        return "Circle[radius= " + radius + " color=" + color + "]";
    }
    public double setRadius(double r)
    {
        radius = r;
        return radius;
    }


}
