package salary;

public abstract class Worker implements SalaryCalculator {
    private String name;
    private String bankNumber;

    Worker(String name, String bankNumber) {
        this.name = name;
        this.bankNumber = bankNumber;
    }

    public String getName() {
        return name;
    }

    public String getBankNumber() {
        return bankNumber;
    }
}
