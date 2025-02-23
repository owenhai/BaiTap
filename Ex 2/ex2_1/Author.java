package ex2_1;

public class Author
{
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getEmail()
    {
        return email;
    }

    public String getName()
    {
        return name;
    }

    public char getGender()
    {
        return gender;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ex2_1.Author[" + name + ", " + email + ", " + gender + "]";
    }
}
