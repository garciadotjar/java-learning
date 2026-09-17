package p14_lambda;

import p14_lambda.domain.Product;
import p14_lambda.domain.ProductFilter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void filter(List<Product> products, ProductFilter filter) {
        for (Product p : products) {
            if (filter.attend(p)) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Jeans", 99.99, "Clothes", 16));
        products.add(new Product("T-Shirt", 59.99, "Clothes", 13));
        products.add(new Product("Coffee", 19.99, "Food", 50));
        products.add(new Product("Banana", 9.99, "Food", 0));
        products.add(new Product("Apple", 9.99, "Food", 0));
        products.add(new Product("iPhone", 3999.99, "Electronics", 10));

        System.out.println("Products that cost more than R$ 100: ");
        filter(products, p -> p.getPrice() > 100);

        System.out.println("-------------");
        System.out.println("Products without stock: ");
        filter(products, p -> p.getInStock() == 0);

    }
}
