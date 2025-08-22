package interfaceLmsTask;

import java.time.LocalDate;

public class Student implements Study{
private String name;
private String surname;
private String gender;
private LocalDate  dateOfStart;
private Educationcenter educationcenter;

    public Student(String name, String surname, String gender, LocalDate dateOfStart, Educationcenter educationcenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationcenter = educationcenter;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public Educationcenter getEducationcenter() {
        return educationcenter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public void setEducationcenter(Educationcenter educationcenter) {
        this.educationcenter = educationcenter;
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println(getName()   +  "okuit" +educationcenter . getName());

    }

    @Override
    public void getStudentsStudyingYear() {
        System.out.println(getName()   +  "okup jatkanyna 5 ushsyncha jyl boldu");
    }
}
