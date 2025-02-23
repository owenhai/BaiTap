package ex4_1;

public class Main
{
    public static void main(String[] args)
    {
        Cylinder cy = new Cylinder();
        System.out.println("ex4_1.Cylinder:"
                + "radius=" + cy.getRadius()
                + " height=" + cy.getHeight()
                + " base area=" + cy.getArea()
                + " volume="+ cy.getVolume());

        Cylinder cy1 = new Cylinder(10.0);
        System.out.println("ex4_1.Cylinder:"
                + "radius=" + cy1.getRadius()
                + " height=" + cy1.getHeight()
                + " base area=" + cy1.getArea()
                + " volume="+ cy1.getVolume());

        Cylinder cy2 = new Cylinder(2.0,10.0);
        System.out.println("ex4_1.Cylinder:"
                + "radius=" + cy2.getRadius()
                + " height=" + cy2.getHeight()
                + " base area=" + cy2.getArea()
                + " volume="+ cy2.getVolume());

        System.out.println(cy);
        System.out.println(cy1);
        System.out.println(cy2);
    }
}