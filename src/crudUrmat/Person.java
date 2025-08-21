package crudUrmat;

import crud.Customer;

import java.time.LocalDate;
import java.util.Arrays;

public class Person {
    private long id;

    private String firstName;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;

    public Person() {
    }

    public Person(long id, String firstName, String email, LocalDate dateOfBirth, String phoneNumber, Person[] people, int count) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.people = people;
        this.count = count;

    }


    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Person[] getPeople() {
        return people;
    }

    public int getCount() {
        return count;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", people=" + Arrays.toString(people) +
                ", count=" + count +
                '}';
    }

    Person[] people = new Person[5];
    int count = 0;


    public void createPerson(Person newPerson) {
        people = Arrays.copyOf(people, people.length + 1);
        people[people.length - 1] = newPerson;
        System.out.println("create person");
    }

    public void getAllPersons() {
        for (Person person : people) {
            System.out.println(person);

        }
    }


}

