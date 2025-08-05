import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Passport passport = new Passport();
//        passport.id = 1234567L;
//        passport.firsName = "Tramp Tegi";
//        passport.lastName = "Donaldbek";
//        passport.year = 1991;
//        passport.gender = "Male";
//        passport.country = "America";
//        passport.getId();
//
//        Student student1 = new Student();
//        student1.name = "Aiana";
//        student1.age = 17;
//        student1.group = "java";
//
//        Student student2 = new Student();
//        student2.name = "Saikal";
//        student2.age = 18;
//        student2.group = "java";
//
//        Student student3 = new Student();
//        student3.name = "Anara";
//        student3.age = 19;
//        student3.group = "js";
//
//        Student student4 = new Student();
//        student4.name = "Sultan";
//        student4.age = 15;
//        student4.group = "js";
//
//        Student student5 = new Student();
//        student5.name = "BekMurat";
//        student5.age = 10;
//        student5.group = "js";
//
//        Student[] array = {student1, student2, student3, student4, student5};
//        int javaCount = 0;
//        int jsCount = 0;
//        for (Student student : array) {
//            if (student.group.equals("java")) {
//                javaCount++;
//            } else {
//                jsCount++;
//            }
//        }
//        System.out.println("java;"+javaCount);
//        System.out.println("js;"+jsCount);
//    }
//        Student student1 = new Student();
//        student1.name = "Aiana";
//        student1.age = 17;
//        student1.group = "java";
//
//        Student student2 = new Student();
//        student2.name = "Saikal";
//        student2.age = 18;
//        student2.group = "java";
//
//        Student student3 = new Student();
//        student3.name = "Anara";
//        student3.age = 19;
//        student3.group = "js";
//
//        Student student4 = new Student();
//        student4.name = "Sultan";
//        student4.age = 15;
//        student4.group = "js";
//
//        Student student5 = new Student();
//        student5.name = "BekMurat";
//        student5.age = 10;
//        student5.group = "js";
//        Student[] array = {student1, student2, student3, student4, student5};
//        int ageCount = 0;
//
//        for (Student student : array) {
//            ageCount += student.age;
//        }
//        int count = ageCount / array.length;
//        System.out.println("ortocho sany ; " + count);
        Juice juice = new Juice();
        juice.taste = "orange";
        juice.color = "yellow";
        juice.temperature = "cold";
        juice.valume = 250;
        juice.getinfo();


        Juice[] array = {juice};
        for (int i = 0; i < array.length; i++) {
            array[i].getinfo();
        }

        Car car = new Car();
        car.color = "black";
        car.brand = "Tesla";
        car.model = "Model 3";
        car.year = 2023;
        car.transmission = "auto";
        car.condition = "new";
        car.getCar();
        Car[] arrays = {car};
        for (int i = 0; i < arrays.length; i++) {
            arrays[i].getCar();

        }


        Table table = new Table();
        table.color = "brown";
        table.material = "wood";
        table.size = "small";
        table.height = "low";
        table.codition = "new";
        table.getInf();
        Table[] arays = {table};
        for (int i = 0; i < arays.length; i++) {
            arays[i].getInf();

        }

        Book book = new Book();
        book.title = "Harry Poter";
        book.author = "J.K";
        book.genre = "fantasy";
        book.language = "English";
        book.year = 1997;
        book.getBook();
        Book[] arra = {book};
        for (int i = 0; i < arra.length; i++) {

        }
    }


}