package polymorphisimTask;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Shark("black", 3, "male"),
                new Shark("grean", 4, "male"),
                new Shark("black", 9, "male"),

                new Turtle("black", 4, "famale"),
                new Turtle("white", 6, "male"),
                new Turtle("grean", 4, "famale"),

                new Eagle("grean", 9, "male"),
                new Eagle("white", 2, "famale"),
                new Eagle("pink", 2, "male"),
        };
        for (Animal animal : animals) {
            if (animal.getColor().equals("white")) {
                System.out.println(animal);
            }
        }
        for (Animal animal : animals) {
            if (animal.getGender().equals("male")) {
                System.out.println(animal);

            }
        } 
Eagle eagle = new Eagle();
        eagle.fly();

        Shark shark = new Shark();
        shark.attact();
        Turtle turtle= new Turtle();
        turtle.swim();



















//        Sheep sheep1 = new Sheep("20", 3, "male", "baran1");
//        Sheep sheep2 = new Sheep("59", 5, "male", "baran2");
//        Sheep sheep3 = new Sheep("35", 4, "Female", "baran3");
//        Sheep[] sheep = {sheep1, sheep2, sheep3};
//        Cow[] cow = {
//                new Cow("200", 5, "male", "Cow1"),
//                new Cow("250", 7, "Female", "Cow2"),
//                new Cow("100", 3, "male", "Cow3"),
//                new Cow("120", 5, "male", "Cow4"),
//                new Cow("500", 10, "male", "Cow5"),
//        };
//        Horse[] horses = {
//                new Horse("100", 10, "kara", "male", "horse"),
//                new Horse("100", 10, "kara", "male", "horse"),
//
//        };
//        Farm farm = new Farm("osh", "Ulan", cow, horses, sheep);
//        System.out.println(farm);
    }
}
