package Builder_Design_Pattern;
import Builder_Design_Pattern.Model.*;
public class BuilderDesignPatten {
    public static void main(String[]Cargs) {
        ConcreteCarBuilder builder = new ConcreteCarBuilder();
        CarDirector director = new CarDirector();

        Car sportsCar = director.constructSportsCar(builder);
        System.out.println("Sports Car built " + sportsCar);

    }
}
