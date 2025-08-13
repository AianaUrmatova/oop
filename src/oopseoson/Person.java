package oopseoson;

public class Person {
    String name;
    String age;
    String work;
    String salary;
    String phone;

    public void Person() {

    }

    public Person(String name, String age, String work, String salary, String phone) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;

    }



    public void getInfo() {
        System.out.println("name;" + name + "\n" +
                "age;" + age + "\n" +
                "work;" + work + "\n" +
                "salary" + salary + "\n" +
                "phone" + phone + "\n"
        );
    }
}
