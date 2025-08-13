package encapsulation;

public class House {
    private String addriess;
    private int namberOfRooms;
    private double area;

    public House() {
    }

    public House(String addriess, int namberOfRooms, double area) {
        this.addriess = addriess;
        this.namberOfRooms = namberOfRooms;
        this.area = area;
    }

    public String getAddriess() {
        return addriess;
    }

    public int getNamberOfRooms() {
        return namberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setAddriess(String addriess) {
        this.addriess = addriess;
    }

    public void setNamberOfRooms(int namberOfRooms) {
        this.namberOfRooms = namberOfRooms;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double calculatePrice(int price) {
        return area * price;
    }

    @Override
    public String toString() {
        return
                "addriess:'" + addriess + '\'' +
                        ", namberOfRooms:" + namberOfRooms +
                        ", area:" + area;
    }
}

