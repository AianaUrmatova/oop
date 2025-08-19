package polymorphisimTask;

import java.util.Arrays;

public class Farm {
    private String address;
    private String overName;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheeps;

    public Farm(){
    }

    public Farm(String address, String overName, Cow[] cow, Horse[] horse, Sheep[] sheep) {
        this.address = address;
        this.overName = overName;
        this.cows = cow;
        this.horses = horse;
        this.sheeps = sheep;
    }

    public String getAddress() {
        return address;
    }

    public String getOverName() {
        return overName;
    }

    public Cow[] getCow() {
        return cows;
    }

    public Horse[] getHorse() {
        return horses;
    }

    public Sheep[] getSheep() {
        return sheeps;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOverName(String overName) {
        this.overName = overName;
    }

    public void setCow(Cow[] cow) {
        this.cows = cow;
    }

    public void setHorse(Horse[] horse) {
        this.horses = horse;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheeps = sheep;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", overName='" + overName + '\'' +
                ", cow=" + Arrays.toString(cows) +
                ", horse=" + Arrays.toString(horses) +
                ", sheep=" + Arrays.toString(sheeps) +
                '}';
    }
}
