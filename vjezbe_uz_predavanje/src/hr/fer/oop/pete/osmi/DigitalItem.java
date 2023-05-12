package hr.fer.oop.pete.osmi;

public class DigitalItem extends LibraryItem implements ItemWithCashDepozit {
    private String type;
    private int deposit;

    public DigitalItem(int id, String name, String type, int deposit) {
        super(id, name);
        this.type = type;
        this.deposit = deposit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getLoanPeriod() {
        return 30;
    }

    @Override
    public double getCashDepositAmount() {
        return deposit;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
}
