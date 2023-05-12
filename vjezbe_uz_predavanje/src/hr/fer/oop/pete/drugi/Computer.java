package hr.fer.oop.pete.drugi;

public abstract class Computer {
    private String model;
    private String manufacturer;
    private String operatingSystem;

    public Computer(String model, String manufacturer, String operatingSystem) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public abstract String getComputerType();

    public abstract int calculatePortabilityScore();

    @Override
    public String toString() {
        return String.format("%s, Manufacturer=%s, operatingSystem=%s", model, manufacturer, operatingSystem);
    }
}
