package lmsTask;

public class Main {
    public static void main(String[] args) {
        String[] courses = {"constructor", "array", "method"};
        MyClass myClass = new MyClass("Aiana", "Urmatova", 17);
        MyClass myClass1 = new MyClass("Aiana", "Urmatova", 17, courses, "Manty");
        myClass.getInfo();
        myClass.snowLessons();
        myClass1.getInfo();
    }
}
