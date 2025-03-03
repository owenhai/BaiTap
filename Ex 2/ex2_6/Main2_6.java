package ex2_6;

public class Main2_6
{
    public static void main(String[] args)
    {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("x = " + p1.getX());
        System.out.println("y = " + p1.getY());
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p2.distance());

        MyPoint[] points = new MyPoint[10];


        for (int i = 0; i < points.length; i++)
        {
            points[i] = new MyPoint(i + 1, i + 1);


            for (MyPoint point : points)
            {
                System.out.println(point);
            }
        }
    }
}

