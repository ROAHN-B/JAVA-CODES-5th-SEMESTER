
interface Sellable {
    double getPrice();
    String getDetails();
}


abstract class Product implements Sellable {
    String name;
    String category;

    Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getDetails() {
        return "Name: " + name + ", Category: " + category;
    }
}


class ElectronicItem extends Product {
    double price;
    int warrantyYears;

    ElectronicItem(String name, double price, int warrantyYears) {
        super(name, "Electronics");
        this.price = price;
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Price: " + price + ", Warranty: " + warrantyYears + " years";
    }
}


class ClothingItem extends Product {
    double price;
    String size;

    ClothingItem(String name, double price, String size) {
        super(name, "Clothing");
        this.price = price;
        this.size = size;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Price: " + price + ", Size: " + size;
    }
}


public class main9 {
    public static void main(String[] args) {
        Product E1 = new ElectronicItem("Samsung", 20000, 2);
        Product C1 = new ClothingItem("ZARA", 2000, "Large");
        
        System.out.println("Details of electronic item is: "+E1.getDetails());
        System.out.println("Details of Clothing item is: "+C1.getDetails());
        System.out.println("Final price: "+(E1.getPrice()+C1.getPrice()));
    }
}
