package ex2_9;

import ex2_6.MyPoint;

public class Main2_9
{
    public static void main(String[] args)
    {
        MyTriangle tri = new MyTriangle(1,1,1,1,1,1);
        System.out.println(tri);
        MyTriangle tri1 = new MyTriangle(new MyPoint(1,1),new MyPoint(2,2),new MyPoint(3,3));
        System.out.println(tri1);

        System.out.printf("Perimeter 1 is: %.2f%n" , tri.getPerimeter());

        System.out.printf("Perimeter 2 is: %.2f%n" , tri1.getPerimeter());

        System.out.println("Triangle Type is :" + tri1.getType());

        System.out.println("Triangle Type is :" + tri.getType());

    }
}
