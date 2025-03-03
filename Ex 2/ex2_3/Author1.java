package ex2_3;

public class Author1
{
    private String name;
    private String email;
    public Author1 (String name, String email)
    {
        this.name = name;
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public String toString()
    {
        return "Author[name"+name+",email"+email+"]";
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

}
