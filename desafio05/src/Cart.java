import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Products added to cart!");
    }

    public void removeProduct(int code) {
        Product productRemoved = null;
        for (Product product : products) {
            if (product.getCode() == code) {
                productRemoved = product;
            }
        }

        if (productRemoved != null) {
            products.remove(productRemoved);
            System.out.println("Product removed: " + productRemoved);
        } else {
            System.out.println("Product with code " + code + " not found.");
        }
    }

    public void calculateProductsCart() {
        double total = 0;
        if (!products.isEmpty()) {
            for (Product product : products) {
                total += product.getPrice();
            }
            System.out.printf("Total: R$ %.2f\n", total);
        } else {
            System.out.println("Cart is empty");
        }
    }

    public void showCart() {
        if(!products.isEmpty()) {
            int i = 0;
            for (Product product : products) {
                System.out.println("Product " + (i + 1));
                product.showInfo();
                i++;

                System.out.println("___________________________________");
            }
            calculateProductsCart();
        } else {
            System.out.println("Cart is empty");
        }
    }
}
