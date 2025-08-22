package interfaceAbstract;

public class Oceanarium {
    public static void main(String[] args) {
        Swimable[] oceanarium = new Swimable[15];
        for (int i = 0; i < 5; i++) {
            oceanarium[i] = new Shark();
        }

        for (int i = 5; i < 10; i++) {
            oceanarium[i] = new Duck();
        }


        for (int i = 10; i < 15; i++) {
            oceanarium[i] = new Turtle();
        }for (Swimable animal:oceanarium){
            animal.swim();
        }
    }
}
