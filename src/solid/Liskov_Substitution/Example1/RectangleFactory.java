package solid.Liskov_Substitution.Example1;

public class RectangleFactory {

    public static Rectangle newRectangle(int width, int hight) {
        return new Rectangle(width, hight);
    }

    public static Rectangle newSquare(int side) {
        return new Square(side);
    }
}
