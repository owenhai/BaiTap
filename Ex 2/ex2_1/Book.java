package ex2_1;

public class Book
{
    private double price;
    private int qty = 0;
    private Author author;
    private String name;

    public Book(String name, double price, int qty, Author author)
    {
        this.price = price;
        this.qty = qty;
        this.author = author;
        this.name = name;
    }

    public Book(String name, double price, Author author)
    {
        this.price = price;
        this.author = author;
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public Author getAuthor()
    {
        return author;
    }

    public String getName()
    {
        return name;
    }

    public int getQty()
    {
        return qty;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }
    @Override
    public String toString()
    {
        return "ex2_1.Book[name=" + name + ",ex2_1.Author[name=" + author.getName() + ",email=" + author.getEmail() + ",gender=" + author.getGender() + ",price=" + price + ",qty=" + qty + "]";
    }
}
