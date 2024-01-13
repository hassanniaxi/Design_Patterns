package Iterator_Design_Pattern;
import java.util.Iterator;
public class Iterator_Design_Pattern {
    public static void main(String[] args) {
            ElementAggregate elementAggregate = new ConcreteElementAggregate();
            ((ConcreteElementAggregate) elementAggregate).addElement("Car");
            ((ConcreteElementAggregate) elementAggregate).addElement("Bike");
            ((ConcreteElementAggregate) elementAggregate).addElement("Truck");
    
            Iterator<String> iterator = elementAggregate.createIterator();
    
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println("Element: " + element);
            }
        }
}
