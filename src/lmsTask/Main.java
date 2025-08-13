package lmsTask;

public class Main {
    public static void main(String[] args) {
//        String[] courses = {"constructor", "array", "method"};
//        MyClass myClass = new MyClass("Aiana", "Urmatova", 17);
//        MyClass myClass1 = new MyClass("Aiana", "Urmatova", 17,
//                courses, "Manty");
//        myClass.getInfo();
//        myClass.snowLessons();
//        myClass1.getInfo();

        System.out.println("========❤️❤️❤️===========");
        University[] universities = new University[3];
        University university1 = new University();
        university1.setName("Harvard");
        university1.setLocation("USA");
        university1.setEstablishedYear(1636);

        University university2 = new University();
        university2.setName("Oxford");
        university2.setLocation("England");
        university2.setEstablishedYear(1096);

        University university3 = new University();
        university3.setName("Stanford");
        university3.setLocation("USA");
        university3.setEstablishedYear(1885);

        universities[0] = university1;
        universities[1] = university2;
        universities[2] = university3;

        System.out.println("==========Universities========");
        for (University uni : universities) {
            uni.printInfo();
        }


        School[] schools = new School[3];
        School schools1 = new School();
        schools1.setName("№1 school");
        schools1.setStudentCount(1000);
        schools1.setType("jalpy bilim beruu");

        School schools2 = new School();
        schools2.setName("IT school");
        schools2.setStudentCount(600);
        schools2.setType("tehnology");

        School schools3 = new School();
        schools3.setName("№75 lisei");
        schools3.setStudentCount(850);
        schools3.setType("lisei");

        schools[0] = schools1;
        schools[1] = schools2;
        schools[2] = schools3;

        System.out.println("========== Schools=========");
        for (School sch : schools) {
            sch.printInfo();
        }

        Car[] cars = new Car[4];

        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setModel("Camry");
        car1.setYear(2018);

        Car car2 = new Car();
        car2.setBrand("BMW");
        car2.setModel("X5");
        car2.setYear(2020);

        Car car3 = new Car();
        car3.setBrand("Tesla");
        car3.setModel("Model 3");
        car3.setYear(2022);

        Car car4 = new Car();
        car4.setBrand("Honda");
        car4.setModel("Civic");
        car4.setYear(2015);

        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;

        System.out.println("===========Car=========");
        for (Car car : cars) {
            car.printInfo();
        }


        Person[] people = new Person[3];

        Person people1 = new Person();
        people1.setName("Aiana");
        people1.setAge(17);
        people1.setOccupation("IT");

        Person people2 = new Person();
        people2.setName("Saikal");
        people2.setAge(22);
        people2.setOccupation("business woman");

        Person people3 = new Person();
        people3.setName("Anara");
        people3.setAge(40);
        people3.setOccupation("Teacher");

        people[0] = people1;
        people[1] = people2;
        people[2] = people3;

        System.out.println("============= Persons==========");
        for (Person person : people) {
            person.printInfo();
//            System.out.println("=========❤️❤️Jyiyntyk❤️❤️=========");
        }
    }
}


