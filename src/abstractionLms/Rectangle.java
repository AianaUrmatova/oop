package abstractionLms;

public class Rectangle extends Shape {
    public Rectangle(double side, double radius, double width,
                     double height, double a, double b, double c) {
        super(side, radius, width, height, a, b, c);
    }

    @Override
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());


    }
}
