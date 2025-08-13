package encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle= new Rectangle();
//        rectangle.setA(6);
//        rectangle.setB(10);
//        rectangle.setC(6);
//        rectangle.setD(10);
//
//        System.out.println(rectangle.getA());
//        System.out.println(rectangle.getB());
//        System.out.println(rectangle.getC());
//        System.out.println(rectangle.getD());
//        rectangle.getInf();
//        Scanner scanner = new Scanner(System.in);
//
//        Student student = new Student();
//        System.out.println("Write last name;");
//        student.setLastName(scanner.nextLine());
//        System.out.println("Write first name: ");
//        student.setFirstName(scanner.nextLine());
//        System.out.println("Write age;");
//        student.setAge(scanner.nextLine());
//
//
//        System.out.println("Add coursee");
//        System.out.println("Course1;");
//        String course1=scanner.nextLine();
//        System.out.println("Course2;");
//        String course2=scanner.nextLine();
//
//
//
//        String[] courses = {course1, course2};
//        student.setCourses(courses);
//        student.getInfo();
        House house = new House("vostok5", 4, 5.6);
        System.out.println(house);
        System.out.println("Total price:  " + house.calculatePrice(1200));
    }
}

