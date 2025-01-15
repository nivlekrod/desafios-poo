import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many products do you want to register?");
        int numberOfProducts = sc.nextInt();
        Product[] product = new Product[numberOfProducts];
        sc.nextLine();

        if (numberOfProducts != 0) {
            for (int i = 0; i < product.length; i++) {
                product[i] = new Product();
                boolean codeExists;

                System.out.println("Product " + (i + 1));

                do {
                    System.out.print("Code: ");
                    int code = sc.nextInt();
                    sc.nextLine();

                    codeExists = false;
                    for (int j = 0; j < i; j++) {
                        if (product[j] != null && product[j].getCode() == code) {
                            codeExists = true;
                            System.out.println("Code already exists. Please enter a different code.");
                            break;
                        }
                    }

                    if (!codeExists) {
                        product[i].setCode(code);
                    }
                } while (codeExists);

                System.out.print("Name: ");
                product[i].setName(sc.nextLine());

                do {
                    System.out.print("Price: ");
                    product[i].setPrice(sc.nextDouble());
                    sc.nextLine();

                    if (product[i].getPrice() < 0) {
                        System.out.println("Error! The price cannot be negative! Try again.");
                    }
                } while (product[i].getPrice() < 0);

                System.out.println("___________________________________");
            }
        }

        System.out.println("------- Product Information -------");
        for (int i = 0; i < product.length; i++) {
            System.out.println("Product " + (i + 1) + ": ");
            if (product[i] != null) {
                product[i].showInfo();
            } else {
                System.out.println("No product was registered");
            }

            if (i < product.length - 1) {
                System.out.println("___________________________________");
            }
        }

        sc.close();
    }
}