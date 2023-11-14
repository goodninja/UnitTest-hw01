package task01.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(55, "кофе"));
        products.add(new Product(155, "чай"));
        products.add(new Product(66, "перец"));
        products.add(new Product(99, "яблоко"));

        // products = Shop.getSortedListProducts(products);
        // System.out.println(products);
        //
        // System.out.println(Shop.getMostExpensiveProduct(products));

        assertThat(products.size()).isEqualTo(4);

        assertThat(Shop.getMostExpensiveProduct(products).getCost()).isEqualTo(155);

        check(products);

    }

    static void check(List<Product> products) {
        String productSort = "";
        Shop.getSortedListProducts(products);
        for (Product product : products) {
            productSort = productSort + product.getCost();
        }
        assertThat(productSort).isEqualTo("155");
    }

}
