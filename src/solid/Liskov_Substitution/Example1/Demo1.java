package solid.Liskov_Substitution.Example1;

public class Demo1 {

    static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);

        System.out.println("Expected area of " + (width * 10) + "" +
                ", got " + rectangle.getArea());
    }

    public boolean isSquare(Rectangle rectangle) {
        return rectangle.getWidth() == rectangle.getHeight();
    }
    public static void main(String[] args) {
        Rectangle rectangle =  new Rectangle(2, 3);
        useIt(rectangle);

        Rectangle square = new Square();
        square.setHeight(5);
        useIt(square);
    }
}
