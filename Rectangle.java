<<<<<<< HEAD
public class Rectangle
{
    private float width, length;
    public Rectangle()
    {
        width = 1.0f;
        length = 1.0f;
    }
    public Rectangle(float width, float length)
    {
        this.width = width;
        this.length = length;
    }
    public float getLength()
    {
        return length;
    }
    public float getWidth()
    {
        return width;
    }
    public void setLength(float length)
    {
        this.length = length;
    }
    public void setWidth(float width)
    {
        this.width = width;
    }
    public double getArea()
    {
        return width * length;
    }
    public double getPerimeter()
    {
        return 2 * width * length;
    }
    public String toString()
    {
        return "Rectangle [width=" + width + ", length=" + length + "]";
    }
}
=======
public class Rectangle
{
    private float width, length;
    public Rectangle()
    {
        width = 1.0f;
        length = 1.0f;
    }
    public Rectangle(float width, float length)
    {
        this.width = width;
        this.length = length;
    }
    public float getLength()
    {
        return length;
    }
    public float getWidth()
    {
        return width;
    }
    public void setLength(float length)
    {
        this.length = length;
    }
    public void setWidth(float width)
    {
        this.width = width;
    }
    public double getArea()
    {
        return width * length;
    }
    public double getPerimeter()
    {
        return 2 * width * length;
    }
    public String toString()
    {
        return "Rectangle [width=" + width + ", length=" + length + "]";
    }
}
>>>>>>> 735151a589353871c9dbdae0afa4cc0c0fbaf6f2
