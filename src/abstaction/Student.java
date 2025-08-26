package abstaction;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private String gender;
    private int LocalDate;
    private int DateOfStart;
    public Student(String name, String surname, String gender, int localDate, int dateOfStart) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        LocalDate = localDate;
        DateOfStart = dateOfStart;
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
    public int getLocalDate() {
        return LocalDate;
    }
    public int getDateOfStart() {
        return DateOfStart;
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
    public void setLocalDate(int localDate) {
        LocalDate = localDate;
    }
    public void setDateOfStart(int dateOfStart) {
        DateOfStart = dateOfStart;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", LocalDate=" + LocalDate +
                ", DateOfStart=" + DateOfStart +
                '}';
    }
}
