package abstaction;

public abstract class EducationCenter {
    private String name;
    private String locatedcountry;
    private String foundationdate;

    public EducationCenter(String name, String locatedcountry, String foundationdate) {
        this.name = name;
        this.locatedcountry = locatedcountry;
        this.foundationdate = foundationdate;
    }

    public String getName() {
        return name;
    }

    public String getLocatedcountry() {
        return locatedcountry;
    }

    public String getFoundationdate() {
        return foundationdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocatedcountry(String locatedcountry) {
        this.locatedcountry = locatedcountry;
    }

    public void setFoundationdate(String foundationdate) {
        this.foundationdate = foundationdate;
    }public abstract void study();

    @Override
    public String toString() {
        return "EducationCenter{" +
                "name='" + name + '\'' +
                ", locatedcountry='" + locatedcountry + '\'' +
                ", foundationdate='" + foundationdate + '\'' +
                '}';
    }
}
