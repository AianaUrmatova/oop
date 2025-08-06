package oopurmat;

public class Flower {
    String name;
    int freeshnes;
    int price;


    public Flower getExpensive(Flower[] flowers) {
        int max = 0;
        for (Flower flower : flowers) {
            if (max < flower.price) {
                max = flower.price;
            }
        }
        for (Flower flower : flowers) {
            if (flower.price == max) {
                return flower;
            }
        }
        return null;
    }

    public Flower getFreeshnes(Flower[] flowers) {
        int min = 0;
        for (Flower flower : flowers) {
            if ( flower.freeshnes>=min) {
                min = flower.freeshnes;
            }
        }
        for (Flower flower : flowers) {
            if (flower.freeshnes == min) {
                return flower;
            }
        }return null;
    }

    public void getInfo() {
        System.out.println("Name: " + name + "\n" +
                           "Freeshes: " + freeshnes + "\n" +
                            "Price: " + price );
    }
}
