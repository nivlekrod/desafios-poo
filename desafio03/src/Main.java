import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many books do you want to register?");
        int numberOfBooks = sc.nextInt();
        Book[] book = new Book[numberOfBooks];
        sc.nextLine();

        if (numberOfBooks != 0) {
            for (int i = 0; i < book.length; i++) {
                book[i] = new Book();

                System.out.println("Book " + (i + 1));

                System.out.print("Title: ");
                book[i].setTitle(sc.nextLine());

                System.out.print("Author: ");
                book[i].setAuthor(sc.nextLine());

                do {
                    System.out.print("Price: ");
                    book[i].setPrice(sc.nextDouble());
                    sc.nextLine();

                    if (book[i].getPrice() < 0) {
                        System.out.println("Error! The price cannot be negative! Try again.");
                    }
                } while (book[i].getPrice() < 0);

                System.out.println("___________________________________");
            }
        }

        System.out.println("------- Book Information -------");
        for (int i = 0; i < book.length; i++) {
            System.out.println("Book " + (i + 1));
            if (book[i] != null) {
                book[i].showInfo();
            } else {
                System.out.println("No book was registered");
            }

            if (i < book.length - 1) {
                System.out.println("___________________________________");
            }
        }

        sc.close();
    }
}