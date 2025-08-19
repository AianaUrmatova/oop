package polymorphisimTask;

public class Turtle extends Animal{
    public Turtle() {
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Turtle(String color, int age, String gender) {
        super(color, age, gender);

    }public  void swim(){
        System.out.println("go");
    }
}
