public class TetsMain2
{
    public static void main(String[] args)
    {
    Employee e1 = new Employee(8,"Duc","Hai",3000);
    System.out.println(e1);
    e1.setSalary(5000);
    System.out.println(e1);
    System.out.println("id is:" + e1.getId());
    System.out.println("firstname is:" + e1.getFirstname());
    System.out.println("lastname is:" + e1.getLastname());
    System.out.println("salary is:" + e1.getSalary());
    System.out.println("name is:" + e1.getName());
    System.out.println("anual salary is:" + e1.getAnnualSalary());
    System.out.println(e1.raiseSalary(50));
    System.out.println(e1);
    }
}
