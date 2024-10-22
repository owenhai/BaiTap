package ex2_1;

public class Main
{
    public static void main(String[] args)
    {
        Author dhai = new Author("Le Duc Hai", "hledell150506@gmail.com", 'm'); // Test the constructor
        System.out.println(dhai);
        dhai.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + dhai.getName());
        System.out.println("email is: " + dhai.getEmail());
        System.out.println("gender is: " + dhai.getGender());
    }
}