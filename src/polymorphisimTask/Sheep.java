package polymorphisimTask;

public class Sheep {
    private String weight;
    private int age;
    private String gender;
    private String nickName;
    public Sheep()  {
    }
    public Sheep(String weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    public String getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weight='" + weight + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
