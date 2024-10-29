package ex4_6;

public class Main
{
    public static void main(String[] args)
    {
        Animal animal = new Animal("Elephant");
        System.out.println(animal);

        Mammal mammal = new Mammal("Mammal");
        System.out.println(mammal);

        Cat cat = new Cat("mimi");
        System.out.println(cat);

        cat.greets();

        Dog dog = new Dog("Ntu");
        System.out.println(dog);

        dog.greets();

        Dog dog1 = new Dog("");

        dog1.greets(dog1);
    }
}
