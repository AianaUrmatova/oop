package lmsTask;

public class University {
    private String name;
    private String location;
    private int establishedYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int year) {
        this.establishedYear = year;
    }

    public void printInfo() {
        System.out.println("name :" + name + "\n " +
                "location :" + location + "\n" +
                " achylgam jyly : " + establishedYear);
    }
}

