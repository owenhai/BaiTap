package ex2_8;

import ex2_6.MyPoint;

public class MyCircle
{
    private MyPoint center;
    private int radius = 1;

    public MyCircle(){}

    public MyCircle(int x, int y, int radius)
    {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public MyPoint getCenter()
    {
        return center;
    }

    public void setCenter(MyPoint center)
    {
        this.center = center;
    }

    public int getCenterX()
    {
        return center.getX();
    }

    public void setCenterX(int x)
    {
        this.center.setX(x);
    }

    public int getCenterY()
    {
        return center.getY();
    }

    public void setCenterY(int y)
    {
        this.center.setY(y);
    }

    public int[] getCenterXY()
    {
        return new int[]{getCenterX(), getCenterY()};
    }

    public void setCenterXY(int x, int y)
    {
        this.center.setX(x);
        this.center.setY(y);
    }

    public String toString()
    {
        return "MyCircle[radius=" + radius + ", center=" + center + "]";
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another)
    {
        return this.center.distance(another.center);
    }

}
