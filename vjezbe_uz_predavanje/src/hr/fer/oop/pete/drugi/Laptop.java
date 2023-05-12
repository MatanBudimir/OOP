package hr.fer.oop.pete.drugi;

public class Laptop extends Computer {
    private int batteryCapacity;
    private double weight;
    public Laptop(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight) {
        super(model, manufacturer, operatingSystem);
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s, batterCapacity=%d, weight=%f", super.toString(), batteryCapacity, weight);
    }

    @Override
    public String getComputerType() {
        return "laptop computer";
    }

    @Override
    public int calculatePortabilityScore() {
        return (int) weight;
    }
}
