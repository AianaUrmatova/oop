package encapsulation;

import javax.xml.namespace.QName;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Student {
    private String lastName;
    private String firstName;
    private String age;
    private String[] courses;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAge() {
        return age;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }



public void getInfo() {
    System.out.println("name;"+ lastName+"\n"+
            "first name;"+ firstName+"\n"+
            "age:"+age+"\n"+
            "course:"+ Arrays.toString(courses));

}}
