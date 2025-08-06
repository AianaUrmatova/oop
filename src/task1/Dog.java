package task1;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog() {

    }

    public Dog(String name, String bored, int age) {
        this.name = name;
        this.breed = bored;
        this.age = age;

    }

    public void getInf() {
        System.out.println("name:" + name + "\n" +
                "breed:" + breed + "\n" +
                "Age:" + age + "\n"
        );
    }
}
