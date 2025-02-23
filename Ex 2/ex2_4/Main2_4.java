package ex2_4;

public class Main2_4
{
    public static void main(String[] args) {
        Customer cs = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(cs);

        cs.setDiscount(8);
        System.out.println(cs);
        System.out.println("Id is: " + cs.getId());
        System.out.println("Name is: " + cs.getName());
        System.out.println("Discount is: " + cs.getDiscount());

        Invoice iv = new Invoice(101, cs, 888.8);
        System.out.println(iv);

        iv.setAmount(999.9);
        System.out.println(iv);

        System.out.println("Id is: " + iv.getId());
        System.out.println("Customer is: " + iv.getCustomerName());
        System.out.println("Amount is: " + iv.getAmount());
        System.out.println("Customer id is: " + cs.getId());
        System.out.println("Customer name is: " + cs.getName());
        System.out.println("Customer discount is: " + cs.getDiscount());
        System.out.printf("Amount after discount is: %.2f%n" , iv.getAmountAfterDiscount());


    }
}
