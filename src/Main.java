import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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