import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// class for Products
class Product {
    private int sku;
    private String name;
    private double unitCost;
    private int unitsOnHand;
    private int unitsNeeded;
    private String specialInstructions;

    // Default constructor for Products
    public Product() {
        this.sku = 0;
        this.name = "";
        this.unitCost = 0.0;
        this.unitsOnHand = 0;
        this.unitsNeeded = 0;
        this.specialInstructions = "";
    }

    // Parameter constructor
    public Product (int sku, String name, double unitCost, int unitsOnHand, int unitsNeeded, String specialInstructions) {
        this.sku = sku;
        this.name = name;
        this.unitCost = unitCost;
        this.unitsOnHand = unitsOnHand;
        this.unitsNeeded = unitsNeeded;
        this.specialInstructions = specialInstructions;
    }

    // Getters and Setters
    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public int getUnitsNeeded() {
        return unitsNeeded;
    }

    public void setUnitsNeeded(int unitsNeeded) {
        this.unitsNeeded = unitsNeeded;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    // Displays product details
    public void display() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("SKU: " + sku);
        System.out.println("Product Name: " + name);
        System.out.println("Unit Cost: $" + df.format(unitCost));
        System.out.println("Unit On Hand: " + unitsOnHand);
        System.out.println("Unit Needed: " + unitsNeeded);
        System.out.println("Special Instructions: " + specialInstructions);
    }

}

// Sub-class of the Product class
class PerishableProduct extends Product {
    private Date expiryDate;

    // default constructor for perishables
    public PerishableProduct() {
        super();
        this.expiryDate = new Date();
    }

    // Parameter constructor
    public PerishableProduct(int sku, String name, double unitCost, int unitsOnHand, int unitsNeeded, String specialInstructions) {
        super(sku, name, unitCost, unitsOnHand, unitsNeeded, specialInstructions);
        this.expiryDate = new Date();
    }

    // Setters and Getters
    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void display() {
        super.display();
        System.out.println("Expiry Date: " + expiryDate.toString());
    }

}
// Main class - Runs the Program
public class Assignment4 {

    public static void main(String[] args) {

        // Creating Products
        Product product1 = new Product(1234, "Cheerios", 11.99, 30, 70, "Happy Healthy Breakfast");
        Product product2 = new Product(1679, "Muskoka Chair", 249.99, 8, 10, "Heavy Item");
        Product product3 = new Product(1436, "PlayStation Game Console", 899.99, 16, 25, "Handle With Care");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date expiryDate1 = parseDate("2024-09-17", dateFormat);
        Date expiryDate2 = parseDate("2024-08-22", dateFormat);

        PerishableProduct perishableProduct1 = new PerishableProduct(4237, "Banana", 1.49, 80, 100, "Store Suspended in Air");
        PerishableProduct perishableProduct2 = new PerishableProduct(4032, "Tomatoes", 2.99, 230, 400, "Store Stem Side Down");

        // Array list to store products
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(perishableProduct1);
        products.add(perishableProduct2);

        // Display product details
        for (Product product : products) {
            System.out.println("\nProduct Details: ");
            product.display();
            System.out.println();
        }

    }

    private static Date parseDate(String dateString, SimpleDateFormat dateFormat) {
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

}
