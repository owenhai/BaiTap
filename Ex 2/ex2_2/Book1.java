package ex2_2;

import ex2_1.Author;

import java.util.Arrays;

public class Book1
{
    private double price;
    private int qty = 0;
    private Author[] authors;
    private String name;

    public Book1 (String name, double price, int qty, Author[] author)
    {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.authors = author;
    }
    public Book1 (String name, double price, Author[] author)
    {
        this.price = price;
        this.name = name;
        this.authors = author;
    }

    public Author[] getAuthor()
    {
        return authors;
    }

    public String getName()
    {
        return name;
    }

    public int getQty()
    {
        return qty;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }
    /*public String getAuthorNames()
    {
        for(int i = 0; i < authors.length; i++)
        {
            String authorNames = "";
            authorNames += authors[i].getName();
        }

        return "";
    }*/
    @Override
    public String toString()
    {
        return "ex2_1.Book[name=" + name + ", authors={ex2_1.Author" +
                Arrays.toString(authors)
                + "}" + ",price=" + price + ", qty=" + qty + ']';

    }

}
