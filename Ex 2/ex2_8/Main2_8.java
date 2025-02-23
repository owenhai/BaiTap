package ex2_8;

import ex2_6.MyPoint;

import java.util.Arrays;

public class Main2_8
{
    public static void main(String[] args)
    {
        MyCircle circle = new MyCircle();

        MyCircle cir1 = new MyCircle(3,4,5);

        MyPoint center = new MyPoint(5,5);

        MyCircle cir2 = new MyCircle(center,10);

        System.out.println("circle:" + circle);
        System.out.println("circle1: " + cir1);
        System.out.println("circle2: " + cir2);

        System.out.println("radius of circle 1 is:" + cir1.getRadius());
        cir1.setRadius(10);
        System.out.println("radius of circle 1 is:" + cir1.getRadius());

        System.out.println("Center of circle 1 is:" + cir1.getCenter());
        cir1.setCenter(new MyPoint(8,8));
        System.out.println("center of circle 1 is:" + cir1.getCenter());

        System.out.println("circle center X is : " + cir1.getCenterX());
        System.out.println("circle center Y is : " + cir1.getCenterY());
        cir1.setCenterX(4);
        cir1.setCenterY(5);
        System.out.println("center of circle 1 is:" + cir1.getCenterX());
        System.out.println("center of circle 1 is:" + cir1.getCenterY());

       cir1.setCenterXY(10,10);
       System.out.println("center of circle 1 is:" + Arrays.toString(cir1.getCenterXY()));

       System.out.printf("Area of circle 1 is: %.2f%n" , cir1.getArea());

       System.out.printf("Circumference of circle 1 is : %.2f%n" , cir1.getCircumference() );

       System.out.printf("Distance between circle 1 and circle 2 : %.2f%n" , cir1.distance(cir2));


    }
}
