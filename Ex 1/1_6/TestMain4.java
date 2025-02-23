public class TestMain4
{
    public static void main(String[] args)
    {
    Account ac1 = new Account("101","Nguyen Van A",88);
    System.out.println(ac1);
    Account ac2 = new Account("102","Nguyen Van B");
    System.out.println(ac2);
        System.out.println("Id is :" + ac1.getId());
        System.out.println("Name is :" + ac1.getName());
        System.out.println("Balance is :" + ac1.getBalance());
            ac1.credit(100);
            System.out.println(ac1);
            ac1.debit(50);
            System.out.println(ac1);
            ac1.debit(500);
            System.out.println(ac1);
            ac1.transferTo(ac2,100);
            System.out.println(ac1);
            System.out.println(ac2);
    }
}
