package interfaceLmsTask;

import java.time.LocalDate;

public abstract class Educationcenter {
    private String name;
    private String locatedCountry;
    private LocalDate  foundationYear;

    public Educationcenter(String name, String locatedCountry, LocalDate foundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }
}
