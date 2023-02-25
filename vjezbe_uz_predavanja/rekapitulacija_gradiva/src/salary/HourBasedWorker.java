package salary;

public class HourBasedWorker extends Worker {
    private static final double MONTHLY_WORKING_HOURS = 160;
    private static final double OVERTIME_FACTOR = 1.2;

    private double workingHours;
    private double salaryPerHour;

    HourBasedWorker(String name, String bankNumber, double salaryPerHour) {
        super(name, bankNumber);
        this.salaryPerHour = salaryPerHour;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public void paySalary(BankManager manager) {
        double amount;
        double overtime = workingHours - MONTHLY_WORKING_HOURS;

        if (overtime > 0.0)
            amount = (workingHours - overtime) * salaryPerHour + overtime * salaryPerHour * OVERTIME_FACTOR;
        else
            amount = workingHours * salaryPerHour;

        manager.payment(this, amount);
    }
}
