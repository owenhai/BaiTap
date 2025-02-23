package ex2_5;

public class Customer1
{
    private int id;
    private String name;
    private int amount;

    public Customer1(int id, String name, int amount)
    {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAmount()
    {
        return amount;
    }

    public String toString()
    {
        return  name + "(" + id + ") ";
    }
}
