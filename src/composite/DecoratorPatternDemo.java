package composite;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();

        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();
    }
}
