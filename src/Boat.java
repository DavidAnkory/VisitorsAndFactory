import java.util.ArrayList;
import java.util.List;

public class Boat extends Element implements ElementType{
    Material material;
    private List<Element> elements;

    public Boat(double width, double length, Material m, String path) {
        super(width, length, path);
        this.material=m;
        this.elements = List.of(ElementDetailsFactory.getPaintingElement(path));
    }

    @Override
    public void accept(ElementTypeVisitor elementTypeVisitor)
    {
        for(Element element: elements)
            element.accept(elementTypeVisitor);
        elementTypeVisitor.visit(this);
    }

    public Material getMaterial() {
        return material;
    }

    public String getName() {
        return "boat";
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AQUATIC;
    }
}
