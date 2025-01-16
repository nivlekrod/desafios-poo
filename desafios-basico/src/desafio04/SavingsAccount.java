package desafio04;

public class SavingsAccount extends Account {
    public SavingsAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public SavingsAccount(String holder) {
        this.holder = holder;
        this.balance = 0;
    }

    public void applyIncome() {
        if (getBalance() > 0) {
            double newBalance = getBalance() * (1 + 0.01);
            setBalance(newBalance);
            System.out.println("Monthly income applied. New Balance: " + getBalance());
        } else {
            System.out.println("No income applied. Balance is 0.");
        }
    }


    public String showInfo() {
        return "SavingsAccount {" +
                "holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
