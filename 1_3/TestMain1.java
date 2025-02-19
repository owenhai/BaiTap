public class TestMain1
{
    public static void main(String[] args)
    {
    Rectangle r1 = new Rectangle(1.6f,1.7f);
    Rectangle r2 = new Rectangle();
    System.out.println(r1);
    System.out.println(r2);
    r1.setLength(6.5f);
    r1.setWidth(7.5f);
    System.out.println(r1);
    System.out.println("length is : " + r1.getLength());
    System.out.println("width is : " + r1.getWidth());
    System.out.println("area is : " + r1.getArea());
    System.out.println("perimeter is : " + r1.getPerimeter());
    }
}
