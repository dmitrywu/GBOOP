package services;

import java.util.List;
import domain.Product;

/**
 *  todo добавить преамбулу
 */

public class VendingMachine {
    private Holder holder;
    private Display display;
    private CoinDespenser coinDespenser;
    private List<Product> products;

    public VendingMachine(Holder holder, Display display, CoinDespenser coinDespenser, List<Product> products) {
        this.holder = holder;
        this.display = display;
        this.coinDespenser = coinDespenser;
        this.products = products;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public CoinDespenser getCoinDespenser() {
        return coinDespenser;
    }

    public void setCoinDespenser(CoinDespenser coinDespenser) {
        this.coinDespenser = coinDespenser;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @apiNote Добавление продукта в аппарат
     * @param product Объект добавляемого продукта
     */
    public void addProduct(Product product) {
        if (product.getPrice() <= 0) {
            product.setPrice(100);
        }
        this.products.add(product);

    }

}
