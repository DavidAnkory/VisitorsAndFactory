import java.util.ArrayList;
import java.util.List;

public class Kite extends Element implements ElementType {
    Color color;
    private List<Element> elements;

    public Kite(double width, double height, Color color, String path) {
        super(width, height, path);
        this.color = color;
        this.elements = List.of(ElementDetailsFactory.getPaintingElement(path));
    }
    @Override
    public void accept(ElementTypeVisitor elementTypeVisitor)
    {
        for(Element element: elements)
            element.accept(elementTypeVisitor);
        elementTypeVisitor.visit(this);
    }


     public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
	
    @Override
    public String getName() {
        return "kite";
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }
}
