import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Employee name: ");
        employee.setName(sc.next());
        System.out.print("Employee salary: ");
        employee.setSalary(sc.nextDouble());

        System.out.println(employee);

        Manager manager = new Manager();
        System.out.print("Manager name: ");
        manager.setName(sc.next());
        System.out.print("Manager salary: ");
        manager.setSalary(sc.nextDouble());
        System.out.print("Manager Bonus: ");
        manager.setSalaryBonus(sc.nextDouble());

        System.out.println(manager);

        sc.close();
    }
}