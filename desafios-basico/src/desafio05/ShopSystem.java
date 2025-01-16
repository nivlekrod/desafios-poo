package desafio05;

import java.util.Scanner;

public class ShopSystem {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        while (true) {
            System.out.println("""
                Menu:
                1. Add Product
                2. Remove Product
                3. Show Cart
                4. Exit
                """);

            System.out.print("Enter your choice: ");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 1 -> {
                    Product product = new Product();

                    boolean codeExists;
                    do {
                        System.out.print("Product Code: ");
                        int code = sc.nextInt();
                        sc.nextLine();

                        codeExists = false;
                        for (Product p : cart.getProducts()) {
                            if (p.getCode() == code) {
                                codeExists = true;
                                System.out.println("Code already exists. Please enter a different code.");
                                break;
                            }
                        }

                        if (!codeExists) {
                            product.setCode(code);
                        }
                    } while (codeExists);

                    System.out.print("Product Name: ");
                    product.setName(sc.nextLine());

                    do {
                        System.out.print("Product Price: ");
                        product.setPrice(sc.nextDouble());
                        sc.nextLine();

                        if (product.getPrice() < 0) {
                            System.out.println("Error! The price cannot be negative! Try again.");
                        }
                    } while (product.getPrice() < 0);

                    cart.addProduct(product);

                    System.out.println("___________________________________");
                }
                case 2 -> {
                    System.out.print("Enter the product code to remove: ");
                    int code = sc.nextInt();
                    sc.nextLine();

                    cart.removeProduct(code);

                    System.out.println("___________________________________");
                }
                case 3 -> {
                    cart.showCart();
                    System.out.println("___________________________________");
                }
                case 4 -> {
                    System.out.println("Exiting program...");
                    System.out.println("___________________________________");
                    return;
                }
                default -> System.out.println("Invalid command. Please try again.");
            }
        }

    }
}
