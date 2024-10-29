package ex4_4;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        MovablePoint mp = new MovablePoint(1, 2, 4, 5);

        MovablePoint mp1 = new MovablePoint(1, 2);

        MovablePoint mp2 = new MovablePoint();

        System.out.println(mp);

        System.out.println(mp1);

        System.out.println(mp2);

        mp1.setXY(7,8);

        System.out.println(mp1);

        System.out.println("x,y="+ Arrays.toString(mp1.getXY()));

        mp2.setxSpeed(10);
        mp2.setySpeed(20);
        System.out.println(mp2);

        mp1.setSpeed(25,35);
        System.out.println(mp1);

        System.out.println("speed=" + Arrays.toString(mp1.getSpeed()));

        mp2.move();
        System.out.println(mp2);

    }
}
