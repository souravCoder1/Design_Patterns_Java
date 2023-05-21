package solid.open_close.Example1;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Product apple =  new Product("Apple", Color.BLUE, Size.SMALL);
        Product tree =  new Product("Tree", Color.GREEN, Size.LARGE);
        Product house =  new Product("House", Color.BLUE, Size.LARGE);

        List<Product> productList = List.of(apple, tree, house);
        ProductFilter productFilter = new ProductFilter();

        System.out.println("Green Products (Old):");
        productFilter.filterByColor(productList, Color.GREEN)
                .forEach(p -> System.out.println(
                        " - " + p.name + " is green"));

        BetterFilter betterFilter = new BetterFilter();
        System.out.println("Green Products (New):");

        betterFilter.filter(productList, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(
                        " - " + p.name + " is green"));

        System.out.println("Large Blue Items:");
        betterFilter.filter(productList, new AndSpecification<>(
                new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.LARGE)
        ))
                .forEach(p -> System.out.println(
                        " - " + p.name + " is Large Blue"));
    }
}





