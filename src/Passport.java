public class Passport {
    Long id;
    String firsName;
    String lastName;
    int year;
    String gender;
    String country;

    public void getId() {
        System.out.println(
                        "id ;" + id + "\n" +
                        "firstname;"+firsName+"\n"+
                        "lastName;"+lastName+"\n"+
                        "year;"+year+"\n"+
                        "Gender:"+gender+"\n"+
                        "country;"+country+"\n");
    }
}
