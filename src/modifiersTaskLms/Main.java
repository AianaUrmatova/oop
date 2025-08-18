package modifiersTaskLms;

public class Main {
    public static void main(String[] args) {
        Circle circle= new Circle(6.6);
        System.out.println("Circle1:");
        System.out.println("Radius:"+6.6);
        System.out.println("Area:"+circle.area());
        System.out.println("uzunduk:"+circle.circumference());

        Circle circle2= new Circle(8.8);
        System.out.println("Circle2:");
        System.out.println("Radius:"+8.8);
        System.out.println("Area:"+circle.area());
        System.out.println("uzunduk:"+circle.circumference());



    }
}
