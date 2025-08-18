package modifiersTaskLms;

public class Circle {
    public static final double Pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double area() {
        return Pi * radius * radius;

    }
    public double circumference(){
        return 2*Pi*radius;
    }
}

