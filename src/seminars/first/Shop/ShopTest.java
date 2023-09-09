package seminars.first.Shop;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {

    public static void main(String[] args) {
        test_basket();
    }

    public static void test_basket() {
        //   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).

        Shop testShop = new Shop();

        ArrayList<Product> basket = new ArrayList<>();
        Product coffee = new Product("coffee", 150);
        basket.add(coffee);
        Product milk = new Product("milk", 50);
        basket.add(milk);
        Product sugar = new Product("sugar", 30);
        basket.add(sugar);
        Product cookies = new Product("cookies", 130);
        basket.add(cookies);
        Product apple = new Product("apple", 15);
        basket.add(apple);

        testShop.setProducts(basket);

        assertThat(testShop.getProducts())
                .isNotEmpty()
                .hasSize(5)
                .doesNotHaveDuplicates()
                .containsAll(basket);

        //   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
        assertThat(testShop.getMostExpensiveProduct().getTitle()).isEqualTo("coffee");
        assertThat(testShop.getMostExpensiveProduct().getCost()).isEqualTo(150);

        //   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
        testShop.sortProductsByPrice();
        assertThat(testShop.getProducts())
                .isNotEmpty()
                .hasSize(5)
                .doesNotHaveDuplicates()
                .startsWith(apple)
                .endsWith(coffee)
                .containsSequence(sugar, milk, cookies);
    }
}