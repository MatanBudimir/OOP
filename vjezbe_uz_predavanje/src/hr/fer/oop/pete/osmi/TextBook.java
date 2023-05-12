package hr.fer.oop.pete.osmi;

public class TextBook extends Book implements ItemWithCashDepozit {
    private String subject;
    private int deposit;

    public TextBook(int id, String name, String author, String subject, int deposit) {
        super(id, name, author);
        this.subject = subject;
        this.deposit = deposit;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int getLoanPeriod() {
        return 120;
    }

    @Override
    public double getCashDepositAmount() {
        return deposit;
    }

    @Override
    public boolean hasCashDeposit() {
        return deposit != 0;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
}
