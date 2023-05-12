package hr.fer.oop.pete.osmi;

public interface ItemWithCashDepozit {
    public default boolean hasCashDeposit() {
        return true;
    }
    public double getCashDepositAmount();
}
