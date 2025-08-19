package polymorphizm;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = {
                new Shark(),
                new Turtle(),
                new Eagle()};
        for (Animal animal1:animal){
            System.out.println(animal1.getClass());
        }
        System.out.println("----------------Turtle---------------");

        int count = 0;
        for (Animal animal1 : animal) {
            if (animal1 instanceof Turtle) {
                count++;
            }
        }

        Turtle[] turtles = new Turtle[count];

        int index = 0;
        for (Animal animal1 : animal) {
            if (animal1 instanceof Turtle) {
                turtles[index] = (Turtle) animal1;
                index++;
            }
        }
        for (Turtle turtle : turtles) {
            turtle.swim();
        }
        System.out.println("--------------Shark---------------------");


        int count1 = 0;
        for (Animal animal1 : animal) {
            if (animal1 instanceof Shark) {
                count1++;
            }
        }


        Shark[] sharks = new Shark[count1];
        int index1 = 0;
        for (Animal animal1 : animal) {
            if (animal1 instanceof Shark) {
                sharks[index1] = (Shark) animal1;
                index1++;
            }
        }
        for (Shark shark : sharks) {
            shark.attak();
        }
        System.out.println("-------------eagle--------------------");
        int count2 = 0;
        for (Animal animal1 : animal) {
            if (animal1 instanceof Eagle) {
                count2++;
            }
        }

        Eagle[] eagles = new Eagle[count2];
        int index2 = 0;
        for (Animal animal1 : animal) {
            if (animal1 instanceof Eagle) {
               eagles[index2]= (Eagle)animal1;
                index2++;
            }
        }
        for (Eagle eagle: eagles){
            eagle.fly();
        }


    }


}

