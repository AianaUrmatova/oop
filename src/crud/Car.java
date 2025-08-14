package crud;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    private Long id;
    private String brand;
    private String model;
    private int year;
    private String color;

    public Car() {
    }

    public Car(long id, String brand, String model, int year, String color) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    Car[] cars = new Car[3];
    int count = 0;

    public void createCar(Car car) {
        cars[count++] = car;
        System.out.println("Success");
    }


    public Car[] getAllCar() {
        return cars;
    }

    public Car getByCar(long id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    public void updateCarByid(long id, Car newCar) {
        Car oldCar = getByCar(id);
        oldCar.setBrand(newCar.getBrand());
        oldCar.setModel(newCar.getModel());
        System.out.println("Create!");
    }

    public void deleteCarById(long id) {
        int index = -1;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId() == id) {
                index = 1;
                break;
            }
        }
        System.out.println(id);
        Car[] newCar = new Car[cars.length - 1];
        for (int i = 0; i <index ; i++) {
            newCar[i]=cars[i];
        }
        cars=newCar;
    }
    public Car getCar(Car car) {
        Scanner scannerForStr = new Scanner(System.in);
        Scanner scannerForNum = new Scanner(System.in);
        Car car1 = new Car();

        System.out.println("Write id :");
        car1.setId(scannerForNum.nextLong());
        System.out.println("Write brand :");
        car1.setBrand(scannerForStr.nextLine());
        System.out.println("Write model :");
        car1.setModel(scannerForStr.nextLine());
        System.out.println("Write year");
        car1.setYear(scannerForStr.nextInt());
        System.out.println("Write color :");
        car1.setColor(scannerForStr.nextLine());


        System.out.println("Write id :");
        car1.setId(scannerForNum.nextLong());
        System.out.println("Write brand :");
        car1.setBrand(scannerForStr.nextLine());
        System.out.println("Write model :");
        car1.setModel(scannerForStr.nextLine());
        System.out.println("Write year");
        car1.setYear(scannerForStr.nextInt());
        System.out.println("Write color :");
        car1.setColor(scannerForStr.nextLine());
        return car1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", cars=" + Arrays.toString(cars) +
                ", count=" + count +
                '}';
    }
}


