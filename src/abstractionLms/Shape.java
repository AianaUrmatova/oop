package abstractionLms;

public abstract class Shape {
    private double side;
    private double radius;
    private double width;
    private double height;
    private double a,b,c ;

    public Shape(double side, double radius, double width, double height, double a, double b, double c) {
        this.side = side;
        this.radius = radius;
        this.width = width;
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSide() {
        return side;
    }

    public double getRadius() {
        return radius;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    } public  abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "side=" + side +
                ", radius=" + radius +
                ", width=" + width +
                ", height=" + height +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

