import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many products do you want to register?");
        int numberOfProducts = sc.nextInt();
        Product[] product = new Product[numberOfProducts];

        if (numberOfProducts != 0) {
            for (int i = 0; i < product.length; i++) {
                product[i] = new Product();

                System.out.print("Code: ");
                product[i].setCode(sc.nextInt());

                System.out.print("Name: ");
                product[i].setName(sc.next());

                System.out.print("Price: ");
                product[i].setPrice(sc.nextDouble());

                System.out.println("_____________________________");
            }
        }

        System.out.println("Product Information:");
        for (int i = 0; i < product.length; i++) {
            System.out.println("Product " + (i + 1) + ": ");
            product[i].showInfo();
            System.out.println("_____________________________");
        }

        sc.close();
    }
}