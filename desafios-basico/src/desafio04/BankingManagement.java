package desafio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingManagement {

    private static List<Account> accounts = new ArrayList<>();

    public static void main() {
        Scanner sc = new Scanner(System.in);

        accounts.add(new CurrentAccount("Kelvin", 1600, 1000));
        accounts.add(new SavingsAccount("Allana", 8000));
        accounts.add(new SavingsAccount("Thiago", 0));

        commandList(sc);

//        sc.close();
    }

    public static void commandList(Scanner sc) {
        while (true) {
            System.out.println(
                    """
                    Which command do you want to run?
                    ------------- Commands -------------
                    1. Select Account
                    2. Exit program
                    """
            );

            System.out.print("Enter your command: ");
            int command = sc.nextInt();

            switch (command) {
                case 1 -> selectAccount(sc);
                case 2 -> {
                    System.out.println("Exiting program...");
                    return;
                }
                default -> System.out.println("Invalid command. Please try again.");
            }
        }
    }

    private static void selectAccount(Scanner sc) {
        while (true) {
            System.out.println("Select an account:");
            for (int i = 0; i < accounts.size(); i++) {
                System.out.println((i + 1) + ". " + accounts.get(i).getHolder());
            }
            System.out.println("0. Back");

            System.out.print("Enter your choice: ");
            int accountOption = sc.nextInt();

            if (accountOption == 0) {
                System.out.println("Returning to the main menu...");
                break;
            } else if (accountOption > 0 && accountOption <= accounts.size()) {
                Account selectedAccount = accounts.get(accountOption - 1);
                System.out.println("You selected: " + selectedAccount.getHolder());

                while (true) {
                    System.out.println("""
                            What do you want to do with this account?
                            1. Deposit
                            2. Withdraw
                            3. Show Balance
                            4. Apply Monthly Income (Savings Account only)
                            5. Back
                            """);

                    System.out.print("Enter your choice: ");
                    int action = sc.nextInt();

                    switch (action) {
                        case 1 -> {
                            System.out.print("Enter the amount to deposit: ");
                            double amount = sc.nextDouble();
                            selectedAccount.deposit(amount);
                        }
                        case 2 -> {
                            System.out.print("Enter the amount to withdraw: ");
                            double amount = sc.nextDouble();
                            selectedAccount.withdraw(amount);
                        }
                        case 3 -> System.out.println("Balance: " + selectedAccount.getBalance());
                        case 4 -> {
                            if (selectedAccount instanceof SavingsAccount) {
                                ((SavingsAccount) selectedAccount).applyIncome();
                            } else {
                                System.out.println("This operation is only available for Savings Accounts.");
                            }
                        }
                        case 5 -> {
                            System.out.println("Returning to account selection...");
                            return;
                        }
                        default -> System.out.println("Invalid choice. Try again.");
                    }
                }
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
