package seminars.first.Shop;

import java.util.*;

public class Shop {
    private List<Product> products;

    public Shop() {
        this.products = new ArrayList<Product>();

    }

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        // Допишите реализацию метода самостоятельно
        this.products.sort(new ComparatorByCost());

        return null;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        Product expensiveProduct = null;
        for (Product item : this.products) {
            if (expensiveProduct == null) {
                expensiveProduct = item;
            } else {
                if (item.getCost() > expensiveProduct.getCost()) {
                    expensiveProduct = item;
                }
            }
        }
        return expensiveProduct;
    }

}