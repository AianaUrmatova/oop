package lmsTask;

public class Person {
    private String name;
    private int age;
    private String occupation;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getOccupation() { return occupation; }
    public void setOccupation(String occupation) { this.occupation = occupation; }

    public void printInfo() {
        System.out.println("name : "+name +"\n"+
                "age : " + age + "\n"+
                "occupation : " + occupation);
    }
}
