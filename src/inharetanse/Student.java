package inharetanse;

public class Student extends Person {
    private String university;
    private String studentId;

    public Student(String name, int age, String university, String studentId) {
        super(name, age);
        this.university = university;
        this.studentId = studentId;
    }

    public void printStudentInfo() {
        super.printInfo();
        System.out.println("university :" + university);
        System.out.println("Student  ID: " + studentId);
    }


    public String getUniversity() {
        return university;
    }

    public String getStudentId() {
        return studentId;
    }


}
