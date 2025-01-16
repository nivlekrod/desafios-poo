public class CurrentAccount extends Account {
    private double withdrawLimit;

    public CurrentAccount(String holder, double balance, double withdrawLimit) {
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public String showInfo() {
        return "CurrentAccount{" +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                "withdrawLimit=" + withdrawLimit +
                '}';
    }
}
