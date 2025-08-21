package abstractionLms;

public class Triangle extends Shape{
    public Triangle(double side, double radius, double width,
                    double height, double a, double b, double c) {
        super(side, radius, width, height, a, b, c);
    } public double getPerimeter() {
        return getA() + getB() + getC();
}}
