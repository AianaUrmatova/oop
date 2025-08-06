package task2;

public class Course {
    String name;
    String instructorName;
    //has a relation
    Student[]students;
    public Course(){

    }
    public Course(String name,String instructorName,Student[] students){
        if(name.length()<=2){
            System.out.println("atyn tuura jazynyz");
            this.name=null;
        }else
        this.name=name;

        }
    }

