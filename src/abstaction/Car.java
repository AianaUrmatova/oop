package abstaction;

public abstract class Car {
    private String model;
    private  String colour;
    private String maxSpend;

    public Car(){
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getMaxSpend() {
        return maxSpend;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setMaxSpend(String maxSpend) {
        this.maxSpend = maxSpend;
    }
 public abstract void  go();
    public  abstract  void brake();


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", maxSpend='" + maxSpend + '\'' +
                '}';
    }

    public Car(String model, String colour, String maxSpend) {
        this.model = model;
        this.colour = colour;
        this.maxSpend = maxSpend;



    }
}
