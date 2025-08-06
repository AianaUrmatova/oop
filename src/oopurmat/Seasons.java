package oopurmat;

import java.util.Scanner;

public class Seasons {
    Scanner scanner= new Scanner(System.in);
    public void getInfo(){
        System.out.println("Write month : ");
    int month= scanner.nextInt();
    switch (month){
        case 1:
            System.out.println("Season : Winter"+"\n"+"month : january");
            break;
        case 2:
            System.out.println("Season : Winter"+"\n"+"month : february");
            break;
        case 3:
            System.out.println("Season : Spring"+"\n"+"month : march");
            break;
        case 4:
            System.out.println("Season : Spring"+"\n"+"month : april");
            break;
        case 5:
            System.out.println("Season : Spring"+"\n"+"month : may");
            break;
        case 6:
            System.out.println("Season : Summer"+"\n"+"month : June");
            break;
        case 7:
            System.out.println("Season : Summer"+"\n"+"month : Jule");
            break;
        case 8:
            System.out.println("Season : Summer"+"\n"+"month : August");
            break;
        case 9:
            System.out.println("Season : Autumn"+"\n"+"month : September");
            break;
        case 10:
            System.out.println("Season : Autumn"+"\n"+"month : October");
            break;
        case 11:
            System.out.println("Season : Autumn"+"\n"+"month : November");
            break;
        case 12:
            System.out.println("Season : Winter"+"\n"+"month : Desember");
            break;
        default:
            System.out.println("There is no such month");


    }

    }
}
