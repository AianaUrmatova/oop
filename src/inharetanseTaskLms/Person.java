package inharetanseTaskLms;



    public class Person {
        private String name;
        private String designation;

        public Person(String name, String designation) {
            this.name = name;
            this.designation = designation;
        }

        // Getters
        public String getName() {
            return name;
        }

        public String getDesignation() {
            return designation;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public void getInf() {
            System.out.println(name + " is learning.");
            System.out.println(name + " is walking.");
            System.out.println(name + " is eating.");
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", designation='" + designation + '\'' +
                    '}';
        }
    }



