package inharetanseTaskLms;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("aiana", "Developer",
                "TechCompany");
        Dancer dancer = new Dancer("Saikal", "danser",
                "ArtGroup");
        Singer singer = new Singer("Diana", "Singer",
                "RockBand");

        System.out.println("=======Programmer========");
        System.out.println(programmer.toString());
        programmer.coding();
        System.out.println("=======dancing==========");
        System.out.println(dancer.toString());
        dancer.dancing();
        System.out.println("======Singer============");
        System.out.println(singer.toString());
        singer.singing();
        singer.playGitar();
    }}
