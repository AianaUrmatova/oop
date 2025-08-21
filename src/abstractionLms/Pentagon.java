package abstractionLms;

public class Pentagon extends Shape {
    public Pentagon(double side, double radius, double width,
                    double height, double a, double b, double c) {
        super(side, radius, width, height, a, b, c);
    }

    public double getPerimeter() {
        return 5 * getSide();
    }
}
