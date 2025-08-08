package lmsTask;

public class School {
    private String name;
    private int studentCount;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int count) {
        this.studentCount = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printInfo() {
        System.out.println(
                       "name :" + name + "\n" +
                        "student count : " + studentCount + "\n" +
                        "type : " + type);
    }
}

