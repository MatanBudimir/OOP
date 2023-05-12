package hr.fer.oop.cetvrte;

public class Vehicle {
    private String regNo;
    private String model;
    private int year;
    private double price;

    public Vehicle(String regNo, String model, int year, double price) {
        this.regNo = regNo;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("RegNo - %s, Model - %s, Year - %d, Price - %f", regNo, model, year, price);
    }

    public double getPricePerDay() {
        return price * 24;
    }

    public final double getPricePerMonth() {
        return getPricePerDay() * 30;
    }

    public static Vehicle getNewestVehicle(Vehicle ...vehicles) {
        Vehicle newest = null;
        int year = 0;

        for (Vehicle vehicle : vehicles)
            if (vehicle.getYear() > year) {
                newest = vehicle;
                year = vehicle.getYear();
            }

        return newest;
    }

    public static void printAllVehiclesWithCargoSpaceGreaterThan(double load, Vehicle ...vehicles) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                if (car.getCargoSpace() > load)
                    System.out.println(car);
            } else if (vehicle instanceof  CargoVan){
                CargoVan cargoVan = (CargoVan) vehicle;

                if (cargoVan.getMaxLoad() > load)
                    System.out.println(cargoVan);
            }
        }
    }
}
