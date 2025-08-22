package interfaceAbstract;

public class Bakerry {
    public static void main(String[] args) {
        Baked[] baked = {
                new Bun(),
                new Bread(),
                new Pie()
        };
        for (Baked baked1 : baked) {
            baked1.Baked();
        }
    }
}
