package solid.open_close.Example1;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    public Stream<Product> filterByColor(List<Product> productList,
                                         Color color) {
        return productList.stream().filter(p -> p.color == color);
    }

    public Stream<Product> filterBySize(List<Product> productList,
                                         Size size) {
        return productList.stream().filter(p -> p.size == size);
    }

    public Stream<Product> filterBySizeAndColor(
                                        List<Product> productList,
                                        Size size,
                                        Color color) {
        return productList.stream().filter(p -> p.size == size
                && p.color == color);
    }
}
