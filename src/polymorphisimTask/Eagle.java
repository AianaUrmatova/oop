package polymorphisimTask;

public class Eagle extends Animal{
    public Eagle() {
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Eagle(String color, int age, String gender) {
        super(color, age, gender);

    }public  void fly(){
        System.out.println("fling");
    }
}
