package abstractionLms;

public class Circle extends Shape {
    public Circle(double side, double radius, double width,
                  double height, double a, double b, double c) {
        super(side, radius, width, height, a, b, c);
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();

    }
}
