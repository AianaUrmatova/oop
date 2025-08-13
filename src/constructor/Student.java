package constructor;

public class Student {
    String name;
    int age;
    String major;


    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.major = "Белгисиз";
    }


    public Student(int age, String major) {
        this.name = "Аты белгисиз";
        this.age = age;
        this.major = major;
    }


    public Student() {
        this.name = "Белгисиз";
        this.age = 0;
        this.major = "Белгисиз";
    }


    public void printInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жашы: " + age);
        System.out.println("Адистиги: " + major);
        System.out.println("--------------------------");
    }

}
