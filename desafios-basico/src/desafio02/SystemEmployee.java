package desafio02;

import java.util.Scanner;

public class SystemEmployee {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Employee name: ");
        employee.setName(sc.nextLine());
        System.out.print("Employee salary: ");
        employee.setSalary(sc.nextDouble());
        sc.nextLine();

        System.out.println(employee);
        System.out.println();

        Manager manager = new Manager();
        System.out.print("Manager name: ");
        manager.setName(sc.nextLine());
        System.out.print("Manager salary: ");
        manager.setSalary(sc.nextDouble());
        System.out.print("Manager Bonus %: ");
        manager.setSalaryBonus(sc.nextDouble());

        System.out.println(manager);

//        sc.close();
    }
}