import java.util.ArrayList;
import java.util.List;

import domain.Bottle;
import domain.HotWater;
import domain.Product;
import services.CoinDespenser;
import services.Display;
import services.Holder;
import services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Product pr1 = new Product(1, "cheaps Lays", 132.13, 13);
        Product pr2 = new Product(2, "chokolate", 212.43, 44);
        Product pr3 = new Product(3, "nuts", 120.00, 24);
        Bottle bottle1 = new Bottle(4, "Cola", 169.99, 85, 0.5);
        HotWater hw1 = new HotWater(5, "Coffee", 120.32, 1, 0.2, 90.0);
        HotWater hw2 = new HotWater(6, "Cocao", 140.11, 2, 0.22, 80.0);
        HotWater hw3 = new HotWater(7, "Tea", 90.12, 3, 0.4, 98.2);
        //Product pr4 = new Product(4, "coca-cola", 169.99, 88);

        List<Product> ourList = new ArrayList<>();
        ourList.add(pr1);
        ourList.add(pr2);
        ourList.add(pr3);
        ourList.add(bottle1);
        ourList.add(hw1);
        ourList.add(hw2);
        ourList.add(hw3);
        //ourList.add(pr4);

        Holder holder = new Holder();
        Display display = new Display();
        CoinDespenser despenser = new CoinDespenser();

        VendingMachine machine = new VendingMachine(holder, display, despenser, ourList);

        for (Product item : machine.getProducts()) {
            System.out.println(item);
        }

    }
}
