package interfaceLmsTask;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        School school1 = new School("5 nomer", "Bishkek", LocalDate.of(2021, 2, 3));
        Uneversity university1 = new Uneversity("Kyrgyz State University", "Kyrgyzstan", LocalDate.of(1950, 1, 1));
        College college1 = new College("Technical College", "Kyrgyzstan", LocalDate.of(1985, 1, 1));

        Student[] student = {
                new Student("Aiana", "urmatova", "Female", LocalDate.of(2008, 8, 7), school1),
                new Student("Diana", "Anvarova", "Female", LocalDate.of(2010, 10, 6), university1),
                new Student("nurislam", "urmatov", "male", LocalDate.of(2014, 6, 12), school1),
                new Student("Safia", "urmatova", "Female", LocalDate.of(2020, 10, 7), college1),
                new Student("Amir", "urmatov", "male", LocalDate.of(2024, 8, 7), university1),
                new Student("Saikal", "Kasymalieva", "Female", LocalDate.of(2003, 7, 3), school1),
                new Student("Aelina", "Sheishenova", "Female", LocalDate.of(2008, 3, 26), college1),
                new Student("Nazik", "Jolochueva", "Female", LocalDate.of(2008, 7, 23), university1),
                new Student("Mariam", "Junushbekova", "Female", LocalDate.of(2008, 11, 9), school1),
                new Student("Anvar", "Junushbekov", "male", LocalDate.of(1987, 10, 9), university1)};
        System.out.println(student);


        System.out.println("=== Студенттер тууралуу маалымат ===");
        for (Student students : student) {

            students.getStudentsEducationCenter();
            students.getStudentsStudyingYear();
        }


    }
}