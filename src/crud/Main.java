package crud;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//
//        Customer customer1 = new Customer();
//        customer1.setId(1L);
//        customer1.setFirsname("Urmtova");
//        customer1.setEmail("a@gmail.com");
//        customer1.setDateOfBrith(LocalDate.of(2008, 7, 8));
//        customer1.setPhoneNumber("501026468");
//
//        Customer customer2 = new Customer();
//        customer2.setId(2L);
//        customer2.setFirsname("Kasymalieva");
//        customer2.setEmail("k@gmail.com");
//        customer2.setDateOfBrith(LocalDate.of(2003, 6, 13));
//        customer2.setPhoneNumber("501026468");
//
//        //create
//        System.out.println("====create=====");
//        customer.createCustomer(customer1);
//        customer.createCustomer(customer2);
////get all
//        System.out.println("====all=========");
//        System.out.println(Arrays.toString(customer.getAllCustomers()));
////        //get by
//        System.out.println("=====by==========");
//        System.out.println(customer.getByCustomer(1L));
//        //update
//        System.out.println("=====Update=======");
//        Customer updareCustomer = new Customer();
//        updareCustomer.setFirsname("aiana");
//        updareCustomer.setEmail("a@gmail");
//        customer.updateCustomerById(2L, updareCustomer);
//
//        System.out.println("=======get all======");
//        System.out.println(Arrays.toString(customer.getAllCustomers()));
        Car car = new Car();
        car.createCar(car.getCar(new Car()));
        car.getByCar(new Scanner(System.in).nextLong());
        car.getAllCar();
        car.updateCarByid(1, car.getCar(new Car()));
         car.deleteCarById(1);
    }
}
