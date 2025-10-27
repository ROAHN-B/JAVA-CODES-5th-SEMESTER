abstract class Product implements Sellable{
    protected String name;
    protected String category;
    protected double price;

    public Product(String name , String category, double price){
        this.name=name;
        this.category=category;
        this.price=price;
    }

    public abstract double calculateDiscount();

    @Override
    public double getPrice(){
        return (price - calculateDiscount());
    }
}

interface Sellable{
    void  displayItemDetails();
    double getPrice();
}

class ElectronicItem extends Product{
    public ElectronicItem(String name, double price){
        super(name,"Electronic",price);
    }

    @Override
    public double calculateDiscount(){
        return price*0.10;
    }

    public void displayItemDetails() {
        System.out.println("Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount: ₹" + calculateDiscount());
        System.out.println("Final Price: ₹" + getPrice());
        System.out.println("-----------------------------------");
    }
}

class ClothingItem extends Product{
    public ClothingItem(String name, double price){
        super(name,"Clothing",price);
    }

    @Override
    public double calculateDiscount(){
        return price*0.15;
    }

    public void displayItemDetails() {
        System.out.println("Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount: ₹" + calculateDiscount());
        System.out.println("Final Price: ₹" + getPrice());
        System.out.println("-----------------------------------");
    }
}


public class Main3{
    public static void main(String [] arg){
        Product laptop = new ElectronicItem("Acer", 70000);
        Product Shirt = new ClothingItem("jockey", 2000);

        laptop.displayItemDetails();
        Shirt.displayItemDetails();
    }
}
