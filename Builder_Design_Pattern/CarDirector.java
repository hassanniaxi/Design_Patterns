package Builder_Design_Pattern;
import Builder_Design_Pattern.Model.*;

class CarDirector {
    public Car constructSportsCar(CarBuilder builder) {
        return builder.setBrand("Ferrari")
                .setModel("California")
                .setYear(2023)
                .addBluetooth()
                .build();
    }
}