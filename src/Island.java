// TODO: Implement Composite (change this file).

import java.util.ArrayList;
import java.util.List;

public class Island extends Element implements ElementType {
    private List<Element> elements;

    public Island(String name, double diameter, String path) {
        super(diameter, diameter, path);
        this.elements = List.of(ElementDetailsFactory.getPaintingElement(path));
    }
    @Override
    public void accept(ElementTypeVisitor elementTypeVisitor)
    {
        for(Element element: elements)
            element.accept(elementTypeVisitor);
        elementTypeVisitor.visit(this);
    }


    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }

    public List<Element> getElements() {
        return elements;
    }

    @Override
    public String getName() {
        return "Island: " + super.getName();
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AQUATIC;
    }
}
