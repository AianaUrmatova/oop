package oopurmat;

public class Main {
    public static void main(String[] args) {;
        Flower flower1 = new Flower();
        flower1.name = "pose";
        flower1.freeshnes = 10;
        flower1.price = 100;


        Flower flower2 = new Flower();
        flower2.name = "romashka";
        flower2.freeshnes = 2;
        flower2.price = 70;


        Flower flower3 = new Flower();
        flower3.name = "Lilia";
        flower3.freeshnes = 5;
        flower3.price = 500;

        Flower[] flowers = {flower1, flower2, flower3};
        System.out.println("-----------price------------");
        Flower flower = flower1.getExpensive(flowers);
        flower.getInfo();
        System.out.println("----------freeshnes----------");
        Flower freeshnes = flower1.getFreeshnes(flowers);
        freeshnes.getInfo();

        System.out.println("----------season-----------");

        Seasons seasons = new Seasons();
        seasons.getInfo();

    }
}
