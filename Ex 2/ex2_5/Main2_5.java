package ex2_5;

public class Main2_5
{
    public static void main (String[] args)
    {
        Customer1 cs = new Customer1(100,"Adam",100);
        System.out.println(cs);

        System.out.println("Id is:" + cs.getId());
        System.out.println("Name is:" + cs.getName());

        Account ac = new Account(100,cs);
        System.out.println(ac);
        Account ac1 = new Account(101,cs,888.8);
        System.out.println(ac1);

        ac1.setBalance(999.9);
        System.out.println(ac1);

        System.out.println("Id is :" + ac1.getId());
        System.out.println("Customer is :" + ac1.getCustomer());
        System.out.println("Customer name is:" + ac1.getCustomerName());
        System.out.println("Account balance is:$" + ac1.getBalance());
        System.out.println("Amount is:" + cs.getAmount());

        ac1.deposit(100);
        System.out.println("Customer After deposit :$" + ac1.getBalance());

        ac1.withdraw(1000);
        System.out.printf("Customer After withdraw :$%.2f%n" , ac1.getBalance());











    }
}
