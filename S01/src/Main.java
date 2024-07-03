public class Main {
    public static void main(String[] args)
    {
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new Product("twix", 80);
        Product product2 = new Bottle("coca-cola", 90, 2);
        Product product3 = new Product("lays", 100);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        System.out.println(vendingMachine);
    }
}