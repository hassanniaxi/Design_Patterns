package Builder_Design_Pattern.Model;

public class Car {
    private String brand;
    private String model;
    private int year;
    private boolean hasGPS;
    private boolean hasBluetooth;

    public Car(String brand, String model, int year, boolean hasGPS, boolean hasBluetooth) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.hasGPS = hasGPS;
        this.hasBluetooth = hasBluetooth;
    }

    // Getter methods for the product attributes
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean hasGPS() {
        return hasGPS;
    }

    public boolean hasBluetooth() {
        return hasBluetooth;
    }

    @Override
    public String toString() {
        return String.format(
                        "%nbrand='%s'%n" +
                        "model='%s'%n" +
                        "year=%d%n" +
                        "hasGPS=%b%n" +
                        "hasBluetooth=%b" 
                        ,
                brand, model, year, hasGPS, hasBluetooth
        );
    }
}