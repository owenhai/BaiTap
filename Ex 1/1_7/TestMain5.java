public class TestMain5
{
    public static void main(String[] args)
    {
        Date d1 = new Date(2024, 10, 5);
        System.out.println(d1);
            d1.setDay(15);
            d1.setMonth(5);
            d1.setYear(2024);
            System.out.println(d1);
            System.out.println("Day : " + d1.getDay());
            System.out.println("Month : " + d1.getMonth());
            System.out.println("Year : " + d1.getYear());
                d1.setDate(2024,3,1);
                System.out.println(d1);
    }
}
