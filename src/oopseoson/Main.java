package oopseoson;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Student student1 = new Student("aiana", "2008",
//                07, 501026468, "kyrgyz");
//        student1.getInfo();
//        Student student2 = new Student("anara", "2006",
//                07, 501026468, "kyrgyz");
//        Student student3 = new Student("aiko", "2006",
//                07, 501026468, "kyrgyz");
//        Student student4 = new Student("beksultan", "2007",
//                07, 501026468, "kyrgyz");
//        Student student5 = new Student("saikal", "2005",
//                07, 501026468, "kyrgyz");
//        Student[] students = {
//                student1, student2, student3, student4, student5
//        };
//        for (int i = 0; i < students.length; i++) {
//            students[i].getInfo();
//
//        }
//
        Person person1 = new Person("aiana", "17", "IT", "5$", "Iphone 11");
        Person person2 = new Person("anara", "18", "teacher", "5$", "Iphone 11");
        Person person3 = new Person("urmat", "19", "nurse", "10$", "Iphone 16");
        Person person4 = new Person("sultan", "7", "docter", "18$", "Iphone 7");
        Person person5 = new Person("saikal", "27", "artist", "20$", "Iphone 16");

        Person[] persons = {person1, person2, person3, person4, person5};
        for (Person person : persons) {
            person.getInfo();

        }
        Person maxsalary = persons[0];
        for (Person person : persons) {
            {
                maxsalary = person;
            }
        }
    }
}

