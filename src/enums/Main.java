package enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("anglische jaz");
        String input = scanner.nextLine().toUpperCase();
        Days day = Days.valueOf(input);
        switch (day) {
            case MONDAY:
                System.out.println(day.getSabak() + "Monday javany okuim");
                break;
            case THURSDAY:
                System.out.println(day.getSabak() + "THURSDAY javany okuim");
                break;
            case WEDNESDAY:
                System.out.println(day.getSabak() + "WEDNESDAY javany okuim");
                break;
            case TUESDAY:
                System.out.println(day.getSabak() + "TUESDAY javany okuim");
                break;
            case FRIDAY:
                System.out.println(day.getSabak() + "Friday javany okyim");
                break;
            case SATURDAY:
                System.out.println(day.getSabak() + "Saturday javany okyim");
                break;
            case SUNDAY:
                System.out.println(day.getSabak() + "Sunday javany okuim");
                break;}
        System.out.println("jumanyn kundotu kyrgyzcha");
        for(Days days:Days.values()){
            System.out.println("-"+days.getSabak());
        }

    }
}
