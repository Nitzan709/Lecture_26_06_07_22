package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample_04 {
    public static final int PRICE_UPPER_BOUND = 20;

    public static void main(String[] args) {
        List<String> names = Arrays.asList("T-Shirt", "Shampoo", "Shoes", "Toothpaste", "Coffee");

        names.stream()
                .map(ProductRepository::findByName)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .filter(StreamExample_04::acceptablePrice)
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Empty!"));
    }

    private static boolean acceptablePrice(Product product) {
        return product.getPrice() >= PRICE_UPPER_BOUND;
    }
}
