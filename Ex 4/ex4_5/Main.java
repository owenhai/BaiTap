package ex4_5;

public class Main
{
    public static void main(String[] args)
    {
        Shape sp = new Shape("black",true);
        System.out.println(sp);
        sp.setColor("White");
        sp.setFilled(false);
        System.out.println(sp);
        System.out.println("color:" +sp.getColor());
        System.out.println("filled:" +sp.isFilled());



        Circle c = new Circle();
        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle(3.0,"Blue",true);

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

        c.setRadius(4.0);
        System.out.println(c.getRadius());
        System.out.println("radius :" + c.getRadius());

        System.out.println("Area 1 :" + c.getArea());
        System.out.println("Perimeter :" + c.getPerimeter());

        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(2.0,3.0);
        Rectangle r2 = new Rectangle(3.0,4.0,"Brown",false);


        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);

        r.setWidth(15.0);
        r.setLength(20.0);
        System.out.println(r);

        System.out.println("Width :" + r.getWidth());
        System.out.println("Length :" + r.getLength());

        System.out.println("Area :" + r.getArea());
        System.out.println("Perimeter :" + r.getPerimeter());

        Square s = new Square();
        Square s1 = new Square(2.0);
        Square s2 = new Square(3.0,"Green",true);

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        s.setSide(14.0);

        System.out.println(s);
        System.out.println("Side :" + s.getSide());

    }
}
