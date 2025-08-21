package abstaction;

public class Main {
    public static void main(String[] args) {
        EducationCenter[] centers = {
                new School("nomer5", "2025", "2000"),
                new University("nomer6", "2025", "2005"),
                new College("nomer6", "2025", "2005")
        };
        Student[] student = new Student[10];
        student[0] = new Student("aiana","urmatova", "male", 2008, 2025);
        student[1] = new Student("anara", "shabdanova", "male", 1962, 2025);
        student[2] = new Student("Saikal", "urmatova", "male", 2003, 2025);
        student[3] = new Student("tansuluu", "urmatova", "male", 2005, 2025);
        student[4] = new Student("aibike", "urmatova", "male", 2007, 2025);
        student[5] = new Student("urmet", "urmatova", "female", 2004, 2025);
        student[6] = new Student("anvar", "urmatova", "female", 1987, 2025);
        student[7] = new Student("sultan", "urmatova", "female", 2010, 2025);
        student[8] = new Student("mirgul", "urmatova", "male", 1989, 2025);
        student[9] = new Student("diana", "urmatova", "male", 2010, 2025);

        for (Student student1 : student) {
            System.out.println(student1);

        }


    }
}

//        Car car = new BMW("M5", "Red", "300");
//        Car car1 = new BMW("M7", "brown", "300");
//
//        Car car2 = new Mers("E600", "corolla", "400");
//        Car car3= new Mers("E700", "black", "400");
//        System.out.println("---------bmw-m5------------");
//        System.out.println(car);
//        System.out.println("----------bmw-m7------------");
//        System.out.println(car1);
//        System.out.println("----------mers-E600----------");
//        System.out.println(car2);
//        System.out.println("----------mers-E700-----------");
//        System.out.println(car3);
//        car.brake();
//        car.go();
//
//        car1.brake();
//        car1.go();
//
//        car2.go();
//        car2.brake();
//
//        car3.go();
//        car3.brake();

