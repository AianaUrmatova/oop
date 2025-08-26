package java19.student.models;

import java19.student.enums.Gender;
import java19.student.enums.Language;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String firstName;
    private LocalDate date;
    private Gender gender;
    private Language language;
    private int phoneNumber;

    public Student() {

    }



    public Student(Long id, String firstName, LocalDate date, Gender gender, Language language,int phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.date = date;
        this.gender = gender;
        this.language = language;
         this.phoneNumber = phoneNumber;
    }


    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getDate() {
        return date;
    }

    public Gender getGender() {
        return gender;
    }

    public Language getLanguage() {
        return language;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", date=" + date +
                ", gender=" + gender +
                ", language=" + language +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
