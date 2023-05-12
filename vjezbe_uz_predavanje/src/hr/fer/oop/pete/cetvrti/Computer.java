package hr.fer.oop.pete.cetvrti;

public abstract class Computer extends Device {
    private String operatingSystem;

    public Computer(String model, String manufacturer, String operatingSystem) {
        super(model, manufacturer);
        this.operatingSystem = operatingSystem;
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
        return String.format("%s, operatingSystem=%s", super.toString(), operatingSystem);
    }
}
