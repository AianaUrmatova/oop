package abstractionLms;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(2.0,2.5,5.6,2.4,9.6,9.7,9.9);
        Shape restangle= new Rectangle(2.4,5.6,6.7,3.5,7.8,8.9,9.9);
        Shape circle= new Circle(7.8,8.9,5.6,4.5,3.5,7.6,7.8);
        Shape triangle = new Triangle(2.3,4.5,6.7,7.8,8.9,8.9,5.6);
        Shape pentagon =new Pentagon(2.3,4.5,7.8,6.7,5.5,6.7,6.7);
        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println("Rectangle perimeter: " + restangle.getPerimeter());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("Pentagon perimeter: " + pentagon.getPerimeter());

    }
}
