package task1;

public class Cat {
    String name;
    String color;
    int age;
     public  Cat(){

     }
     public Cat(String name,String color,int age){
         this.name=name;
         this.color=color;
         this.age=age;
     }
     public void getInfo(){
         System.out.println("Name:"+name+"\n"+
                 "Color:"+color+"\n"+
                 "Age:"+age+"\n");
     }
}
