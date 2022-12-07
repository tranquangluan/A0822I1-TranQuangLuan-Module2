package ss07_abstractClass_interface.exercise.colorable;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        ((Circle) shape1).howToColor();
        ((Rectangle) shape2).howToColor();
    }
}
