package ex2_2;

import ex2_1.Author;

public class Main2
{
    public static void main(String[] args)
    {

    Author[] authors = new Author[2];
    authors[0] = new Author("12","ddd",'f');
    authors[1] = new Author("13","aaa",'f');

    Book1 book1 = new Book1("dum",19.99,99,authors);
        System.out.println(book1);

    }
}
