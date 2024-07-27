public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double price;

    public Vehicle() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.price = 0.0;
    }

    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    public void depreciateValue(double percentage) {
        double depreciationAmount = price * (percentage / 100);
        price -= depreciationAmount;
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle("Toyota", "Camry", 2022, 25000.0);

        System.out.println("Vehicle 1:");
        vehicle1.displayInfo();
        System.out.println("\nVehicle 2:");
        vehicle2.displayInfo();

        vehicle2.depreciateValue(10);
        System.out.println("\nVehicle 2 after depreciation:");
        vehicle2.displayInfo();
    }
}
