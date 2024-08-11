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



public class Assignment4 {

    public static void main(String[] args) {

    }

}
