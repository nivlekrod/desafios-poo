package desafio04;

public class Account {
    protected String holder;
    protected double balance;

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Error! Deposit amount must be positive!");
        }
    }

    public void withdraw (double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
            } else {
                System.out.println("Error! Insufficient balance for this withdrawal!");
            }
        } else {
            System.out.println("Error! Withdrawal amount must be positive!");
        }
    }

}
