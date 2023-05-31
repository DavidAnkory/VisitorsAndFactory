import java.util.ArrayList;
import java.util.List;

public class Lake extends Element implements ElementType{
    private List<Element> elements;

    public Lake(String name, double diameter, String path) {
        //TODO: fix
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


    @Override
    public String getName() {
        return "Lake" + super.getName();
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }
}
