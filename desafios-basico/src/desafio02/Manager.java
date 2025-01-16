package desafio02;

public class Manager extends Employee {
    private double salaryBonus;

    public double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(double salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    @Override
    public double totalSalary() {
        return super.totalSalary() * (1 + getSalaryBonus()/100);
    }

    @Override
    public String toString() {
        return "Manager: " + getName() +
                ", Salary Bonus: " + getSalaryBonus() + "%"+
                ", Total Salary: " + totalSalary();
    }
}
