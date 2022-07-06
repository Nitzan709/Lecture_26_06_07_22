package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample_03 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("T-Shirt", "Shampoo", "Socks", "Toothpaste");

        List<Product> products = names.stream()
                .map(ProductRepository::findByName)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .filter(product -> product.getPrice() >= 20)
                .collect(Collectors.toList());

        System.out.println(products);
    }
}
