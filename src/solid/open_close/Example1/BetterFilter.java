package solid.open_close.Example1;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements FilterI<Product> {
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> specs) {
        return items.stream().filter(p -> specs.isSatisfied(p));
    }
}
