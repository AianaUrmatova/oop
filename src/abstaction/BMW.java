package abstaction;

 class BMW  extends Car{
     public BMW() {
     }

     public BMW(String model, String colour, String maxSpend) {
         super(model, colour, maxSpend);
     }

     @Override
     public void go() {
         System.out.println("go");
     }

     @Override
     public void brake() {
         System.out.println("brake");
     }

 }
