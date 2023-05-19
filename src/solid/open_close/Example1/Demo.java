package solid.open_close.Example1;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Product apple =  new Product("Apple", Color.BLUE, Size.SMALL);
        Product tree =  new Product("Tree", Color.GREEN, Size.LARGE);

        List<Product> productList = List.of(apple, tree);
        ProductFilter productFilter = new ProductFilter();

        System.out.println("Green Products :");
        productFilter.filterByColor(productList, Color.GREEN)
                .forEach(p -> System.out.println(
                        " - " + p.name + " is green"));
    }
}
