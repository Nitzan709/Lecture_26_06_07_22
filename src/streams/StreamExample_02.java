package streams;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample_02 {
    public static void main(String[] args) {
        Integer[] ids = {1, 2, 3};
        //Declarative code
        Stream.of(ids)
                .map(ProductRepository::findById)
                .filter(Optional::isPresent)
                .forEach(System.out::println);
    }
}
