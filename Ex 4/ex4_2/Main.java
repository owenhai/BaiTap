package ex4_2;

public class Main
{
    public static void main(String[] args)
    {
        Person p = new Person("James","144 London");
        System.out.println(p);

        p.setName("David");
        p.setAddress("152 Paris");
        System.out.println(p);

        System.out.println(p.getAddress());
        System.out.println(p.getName());

        Staff s = new Staff("Jin","123 Berlin","Havard",2.0);
        System.out.println(s);

        s.setSchool("Oxford");
        s.setPay(15.0);

        System.out.println(s);

        System.out.println(s.getPay());
        System.out.println(s.getSchool());

        Student student = new Student("Yan","123 NewYork","ABC",2025,5.0);
        System.out.println(student);

        student.setName("James");
        student.setAddress("152 Paris");
        student.setProgram("BDF");

        System.out.println(student);

        System.out.println(student.getAddress());
        System.out.println(student.getProgram());
        System.out.println(student.getProgram());
    }
}
