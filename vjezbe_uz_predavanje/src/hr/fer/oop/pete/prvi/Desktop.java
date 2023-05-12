package hr.fer.oop.pete.prvi;

public class Desktop extends Computer {
    private double caseHeight;

    public Desktop(String model, String manufacturer, String operatingSystem, double caseHeight) {
        super(model, manufacturer, operatingSystem);
        this.caseHeight = caseHeight;
    }

    public double getCaseHeight() {
        return caseHeight;
    }

    public void setCaseHeight(double caseHeight) {
        this.caseHeight = caseHeight;
    }

    @Override
    public String toString() {
        return String.format("%s, caseHeight=%f", super.toString(), caseHeight);
    }
}
