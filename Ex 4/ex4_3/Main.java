package ex4_3;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Point2D p2d = new Point2D();
        Point2D p2d1 = new Point2D(5,4);
        System.out.println(p2d);
        System.out.println(p2d1);

        p2d.setXY(9,10);

        System.out.println(p2d);

        System.out.println(Arrays.toString(p2d.getXY()));

        Point3D p3d = new Point3D();
        Point3D p3d1 = new Point3D(5,4,5);
        System.out.println(p3d);
        System.out.println(p3d1);

        p3d.setXYZ(9,10,15);
        System.out.println(p3d);

        System.out.println(Arrays.toString(p3d.setXYZ()));
    }
}
