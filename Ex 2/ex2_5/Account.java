package ex2_5;


public class Account
{
    private Customer1 customer1;
    private double balance = 0.0;
    private int id;

    public Account(int id, Customer1 customer1, double balance)
    {
        this.id = id;
        this.customer1 = customer1;
        this.balance = balance;
    }

    public Account(int id, Customer1 customer1)
    {
        this.id = id;
        this.customer1 = customer1;
    }

    public int getId()
    {
        return id;
    }

    public Customer1 getCustomer()
    {
        return customer1;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String toString()
    {
        return customer1 + "balance=$" + balance;
    }
    public String getCustomerName()
    {
        return customer1.getName();
    }

    public Account deposit(double amount)
    {
     balance += amount;
     return this;
    }

    public Account withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Amount withdraw exceeds the current balance");

        }
        return this;
    }

}
