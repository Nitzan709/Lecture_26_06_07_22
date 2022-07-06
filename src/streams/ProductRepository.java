package streams;

import java.util.Optional;

public class ProductRepository {
    public static final Product[] PRODUCTS = new Product[]{
            new Product(1, "Shampoo", 15),
            new Product(2, "Shoes", 450),
            new Product(3, "Toothpaste", 27),
    };

    public static Optional<Product> findById(int id) {
        for (Product product : PRODUCTS) {
            if (product.getId() == id) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public static Optional<Product> findByName(String name) {
        for (Product product : PRODUCTS) {
            if (product.getName().equals(name)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
