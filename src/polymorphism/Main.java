package polymorphism;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Programmer(),
            new Singer(),
            new Dancer()};
        for (Person person:people){
            person.walk();
        }
    }
}
