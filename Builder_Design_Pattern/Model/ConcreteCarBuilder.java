package Builder_Design_Pattern.Model;

public class ConcreteCarBuilder implements CarBuilder {
    private Car car;

    public ConcreteCarBuilder() {
        this.car = new Car("", "", 0, false, false);
    }

    @Override
    public CarBuilder setBrand(String brand) {
        car = new Car(brand, car.getModel(), car.getYear(), car.hasGPS(), car.hasBluetooth());
        return this;
    }

    @Override
    public CarBuilder setModel(String model) {
        car = new Car(car.getBrand(), model, car.getYear(), car.hasGPS(), car.hasBluetooth());
        return this;
    }

    @Override
    public CarBuilder setYear(int year) {
        car = new Car(car.getBrand(), car.getModel(), year, car.hasGPS(), car.hasBluetooth());
        return this;
    }

    @Override
    public CarBuilder addGPS() {
        car = new Car(car.getBrand(), car.getModel(), car.getYear(), true, car.hasBluetooth());
        return this;
    }

    @Override
    public CarBuilder addBluetooth() {
        car = new Car(car.getBrand(), car.getModel(), car.getYear(), car.hasGPS(), true);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}