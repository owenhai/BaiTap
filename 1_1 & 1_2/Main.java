public class Main
{
    public static void main(String[] args)
    {
    Circle c1 = new Circle();
    System.out.println("The Circle has radius of " + c1.getRadius() + ", " + c1.getArea());
    Circle c2 = new Circle(2.0);
    System.out.println("The Circle has radius of " + c2.getRadius() + ", " + c2.getArea());
    }
}