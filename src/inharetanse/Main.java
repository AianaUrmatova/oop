package inharetanse;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("aiana", 17,
                "Garvard", "S12345");
        Teacher teacher = new Teacher("Aizat", 18,
                "matematika", 55000.0);
        System.out.println("------ Student ------");
        student.printStudentInfo();
        System.out.println("------ teacher ------");
        teacher.printTeacherInfo();
    }
}
