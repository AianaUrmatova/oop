package polymorphisimTask;

import polymorphism.Person;

public class Animal {
    public String color;
    public int age;
    public String gender;
    public Animal(){
    }
    public Animal(String color, int age, String gender) {
        this.color = color;
        this.age = age;
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
