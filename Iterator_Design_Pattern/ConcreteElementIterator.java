package Iterator_Design_Pattern;
import java.util.Iterator;
import java.util.List;
// import java.util.Iterator;
class ConcreteElementIterator implements ElementIterator, Iterator<String> {
    private List<String> elements;
    private int position;

    public ConcreteElementIterator(List<String> elements) {
        this.elements = elements;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < elements.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            String element = elements.get(position);
            position++;
            return element;
        }
        return null;
    }
}