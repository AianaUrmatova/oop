package inharetanse;

public class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public void printTeacherInfo() {
        super.printInfo();
        System.out.println("sagagy: " + subject);
        System.out.println("ailygy: $" + salary);
    }


    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }
}

