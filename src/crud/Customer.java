package crud;

import java.time.LocalDate;
import java.util.concurrent.Callable;

public class Customer {
    private long id;
    private String firsname;
    private String email;
    private LocalDate dateOfBrith;
    private String phoneNumber;

    public Customer() {
    }

    public Customer(long id, String firsname, String email, LocalDate dateOfBrith, String phoneNumber) {
        this.id = id;
        this.firsname = firsname;
        this.email = email;
        this.dateOfBrith = dateOfBrith;
        this.phoneNumber = phoneNumber;

    }

    public long getId() {
        return id;
    }

    public String getFirsname() {
        return firsname;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBrith() {
        return dateOfBrith;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBrith(LocalDate dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    Customer[] customers = new Customer[10];
    int count = 0;

    // TODO CRUD
    //TODO C-
    public void createCustomer(Customer customer) {
        customers[count++] = customer;
        System.out.println("Success");
    }
//TODO R-
    public Customer[] getAllCustomers() {
        return customers;
    }

    public Customer getByCustomer(long id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
//TODO update
    public void updateCustomerById(long id, Customer newCustomer) {
        Customer oldCustomer = getByCustomer(id);
        oldCustomer.setFirsname((newCustomer.getFirsname()));
        oldCustomer.setEmail(newCustomer.getEmail());
        System.out.println("success");
    }
//TODO delate
    public void deleteCustomerById(long id) {
        int index = -1;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId() == id) {
                index = 1;
                break;
            }
        }

        Customer[] newCutomers = new Customer[customers.length - 1];
        for (int i = 0; i < index; i++) {
            newCutomers[i] = customers[i];
        }
        for (int i = 0; i < newCutomers.length; i++) {
            newCutomers[i] = customers[i - 1];

        }
        customers=newCutomers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id + "\n" +
                ", firsname='" + firsname + "\n" +
                ", email='" + email + "\n" +
                ", dateOfBrith=" + dateOfBrith + "\n" +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}





