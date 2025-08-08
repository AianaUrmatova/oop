package lmsTask;

public class MyClass {
    String name;
    String surname;
    int age;
    String[] courses;
    String food;


    public MyClass(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public MyClass(String name, String surname, int age, String[] courses, String favoriteFood) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.courses = courses;
        this.food = favoriteFood;
    }

    public void getInfo() {
        System.out.println("Аты: " + name + "\n" +
                "Фамилиясы: " + surname + "\n" +
                "Жашы: " + age + "\n");

    }public void snowLessons(){
        if (courses != null) {
            System.out.print("Курстар: ");
            for (String c : courses) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        if (food != null) {
            System.out.println("Жакшы көргөн тамак: " + food);
        }

        System.out.println();
    }
    }


