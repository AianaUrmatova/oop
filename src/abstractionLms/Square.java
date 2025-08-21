package abstractionLms;

public class Square extends Shape {
    public Square(double side, double radius,
                  double width, double height, double a, double b, double c) {
        super(side, radius, width, height, a, b, c);
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());

    }
}
