package hr.fer.oop.pete.sedmi;

public abstract class Van extends Vehicle {
    private double height;

    public Van(String registrationNo, String model, double height) {
        super(registrationNo, model);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("%s, height=%f", super.toString(), height);
    }
}
