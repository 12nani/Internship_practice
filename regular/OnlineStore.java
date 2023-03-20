import java.util.ArrayList;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) throws ProductNotFoundException {
        if (products.contains(product)) {
            products.remove(product);
        } else {
            throw new ProductNotFoundException("Product not found in the store!");
        }
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

public class OnlineStoreTest {
    public static void main(String[] args) {
        Product product1 = new Product(1, "iPhone 13", 999.99);
        Product product2 = new Product(2, "Samsung Galaxy S21", 799.99);
        Store store = new Store();
        store.addProduct(product1);
        store.addProduct(product2);
        System.out.println("Products in the store:");
        store.displayProducts();d
        try {
            store.removeProduct(product2);
            System.out.println("\nProduct 2 removed from the store.");
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nProducts in the store after removing product 2:");
        store.displayProducts();

        try {
            store.removeProduct(product2);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
