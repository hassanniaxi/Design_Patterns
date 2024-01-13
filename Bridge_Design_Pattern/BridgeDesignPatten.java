
package Bridge_Design_Pattern;
import Bridge_Design_Pattern.Implemetation.VeggiePizza;
import Bridge_Design_Pattern.Abstraction.Restaurant;
import Bridge_Design_Pattern.Implemetation.PepperoniPizza;
import Bridge_Design_Pattern.Abstraction.ItalianRestaurant;
import Bridge_Design_Pattern.Abstraction.AmericanRestaurant;


public class BridgeDesignPatten {
    public static void main(String[] args) {

        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
    } 
}