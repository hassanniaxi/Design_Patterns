package Builder_Design_Pattern.Model;


public interface CarBuilder {
    CarBuilder setBrand(String brand);

    CarBuilder setModel(String model);

    CarBuilder setYear(int year);

    CarBuilder addGPS();

    CarBuilder addBluetooth();

    Car build();
}
