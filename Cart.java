import java.util.ArrayList;

interface Sellable {
    public double getPrice();
    public String getDetails();
}

abstract class Product {
    protected String name;
    protected String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }
}

class ElectronicItem extends Product implements Sellable {
    private double price;
    private String brand;

    public ElectronicItem(String name, String brand, double price) {
        super(name, "Electronics");
        this.brand = brand;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getDetails() {
        return this.brand + " " + this.name;
    }
}

class ClothingItem extends Product implements Sellable {
    private double price;
    private String size;

    public ClothingItem(String name, String size, double price) {
        super(name, "Clothing");
        this.size = size;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getDetails() {
        return this.name + " (Size: " + this.size + ")";
    }
}

public class Cart {
    public static void main(String[] args) {
        
        Sellable[] cart = new Sellable[3];
        
        cart[0] = new ElectronicItem("Laptop", "Dell", 1200.50);
        cart[1] = new ClothingItem("T-Shirt", "M", 25.99);
        cart[2] = new ElectronicItem("Headphones", "Sony", 199.99);

        double totalBill = 0.0;

        System.out.println("--- Your Shopping Cart ---");

        for (Sellable item : cart) {
            String details = item.getDetails();
            double price = item.getPrice();
            
            System.out.printf("Item: %-25s | Price: $%,.2f\n", details, price);
            
            totalBill += price;
        }

        System.out.println("-------------------------------------------");
        System.out.printf("Final Bill Total: $%,.2f\n", totalBill);
    }
}
