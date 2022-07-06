package streams;

import java.util.Arrays;

public class StreamExample_05 {
    public static void main(String[] args) {
        Arrays.stream(ProductRepository.PRODUCTS)
                .mapToDouble(Product::getPrice)
                .max()
                .ifPresent(System.out::println);
    }
}
