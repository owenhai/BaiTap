package ex2_1;

public class Main1
{
    public static void main(String[] args)
    {
    Author dhai = new Author("Le Duc Hai","hledell150506@gmail.com", 'm');
    System.out.println(dhai);

    Book book = new Book("Java for dummy",29,18,dhai);
    System.out.println(book);

    book.setPrice(29);
    book.setQty(28);

    System.out.println("name is : " + book.getName());
    System.out.println("author is : " + book.getAuthor());
    System.out.println("price is : " + book.getPrice());
    System.out.println("qty is : " + book.getQty());
    System.out.println("ex2_1.Author's email is :" + book.getAuthor().getEmail());
    System.out.println("ex2_1.Author's name is :" + book.getAuthor().getName());

    Book anotherBook = new Book("more Java", 29,
            new Author("Dd","faffaf@",'f'));
    System.out.println(anotherBook);
    }
}
