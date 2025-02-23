package ex2_7;

import ex2_6.MyPoint;

public class Main2_7
{
    public static void main (String[] args)
    {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(2, 3);

        MyLine l1 = new MyLine(p1, p2);

        System.out.println(l1);

        System.out.println("Length: " + l1.getLength());

        System.out.println("Gradient: " + l1.getGradient());

        l1.setBeginXY(2, 3);

        l1.setEndXY(7, 8);

        System.out.println("Modified line: " + l1);
        System.out.println("New Length: " + l1.getLength());
    }
}
