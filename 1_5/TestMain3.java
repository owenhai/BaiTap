public class TestMain3
{
    public static void main(String[] args)
    {
    InvoiceItem it1 = new InvoiceItem("A111","Pen Blue",999,0.09);
    System.out.println(it1);
    it1.setQty(1111);
    it1.setUnitPrice(0.9);
    System.out.println(it1);
    System.out.println("id is:" + it1.getId());
    System.out.println("desc is:" + it1.getDesc());
    System.out.println("qty is:" + it1.getQty());
    System.out.println("unitPrice is:" + it1.getUnitPrice());
    System.out.println("The total is:" + it1.getTotal());
    }
}
