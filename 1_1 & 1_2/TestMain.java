public class TestMain
{
    public static void main(String[] args)
    {
    Circle c1 = new Circle(2.0);
    Circle c2 = new Circle();
    System.out.println(c1);
    System.out.println(c2);
    c1.setRadius(3.0);
    System.out.println(c1);
    System.out.println("radius is:" + c1.getRadius());
    System.out.println("area is: " + c1.getArea());
    System.out.println("circumference is: " +c1.getCircumference());
    }
}
