package ex2_3;

public class Book2
{
    private String isbn;
    private String name;
    private Author1 author;
    private double price;
    private int qty = 0;
    private Author1 email;


    public Book2(String isbn, String name, Author1 author, double price)
    {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public  Book2(String isbn, String name, Author1 author, double price, int qty)
    {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public String getName()
    {
        return name;
    }
    public Author1 getAuthor()
    {
        return author;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQty()
    {
        return qty;
    }
    public void setQty(int qty)
    {
        this.qty = qty;
    }
    public String getAuthorName()
    {
        return author.getName();
    }

    @Override
    public String toString() {
        return "Book[isbn=" + isbn + ", name=" + name + ", Author[=" + author.getName()
                + "email=" + author.getEmail() + "], price=" + price + "]";
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
