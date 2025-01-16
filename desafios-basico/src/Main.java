import desafio01.ProductRegistration;
import desafio02.SystemEmployee;
import desafio03.Library;
import desafio04.BankingManagement;
import desafio05.ShopSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Menu:
                    1. Product Registration
                    2. System Employee
                    3. Library
                    4. Banking Management
                    5. Shop System
                    6. Exit
                    """);

            System.out.print("Enter your choice: ");

            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 1 -> {
                    System.out.println("Running Product Registration...");
                    ProductRegistration.main();
                }
                case 2 -> {
                    System.out.println("Running System Employee...");
                    SystemEmployee.main();
                }
                case 3 -> {
                    System.out.println("Running Library...");
                    Library.main();
                }
                case 4 -> {
                    System.out.println("Running Banking Management...");
                    BankingManagement.main();
                }
                case 5 -> {
                    System.out.println("Running Shop System...");
                    ShopSystem.main();
                }
                case 6 -> {
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
