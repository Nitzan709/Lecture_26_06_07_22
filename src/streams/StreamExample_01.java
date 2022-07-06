package streams;

import java.util.Arrays;

public class StreamExample_01 {
    public static void main(String[] args) {
        Arrays.stream(ProductRepository.PRODUCTS)
                .forEach(System.out::println);
    }
}
