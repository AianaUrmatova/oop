package abstaction;

public class Mers extends Car{
    @Override
    public void go() {
        System.out.println("go");
    }

    @Override
    public void brake() {
        System.out.println("brake");
    }

    public Mers() {
    }

    public Mers(String model, String colour, String maxSpend) {
        super(model, colour, maxSpend);
    }
}
