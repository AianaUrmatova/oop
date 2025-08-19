package polymorphisimTask;

public class Horse {
    private String weight;
    private int age;
    private String color;
    private String gender;
    private String nickName;
    public Horse(){

    }
    public Horse(String weight, int age, String color, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.nickName = nickName;
    }

    public String getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight='" + weight + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
