package polymorphisimTask;

public class Shark extends Animal{
    public Shark() {
    }

    public Shark(String color, int age, String gender) {
        super(color, age, gender);
    }
    public void attact(){
        System.out.println(" Shark swimming");
    }
}
