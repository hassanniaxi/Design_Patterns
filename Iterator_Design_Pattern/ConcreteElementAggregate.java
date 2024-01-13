package Iterator_Design_Pattern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteElementAggregate implements ElementAggregate {
    private List<String> elements;

    
    public ConcreteElementAggregate() {
        this.elements = new ArrayList<>();
    }

    public void addElement(String element) {
        elements.add(element);
    }

    @Override
    public Iterator<String> createIterator() {
        return new ConcreteElementIterator(elements);
    }
}