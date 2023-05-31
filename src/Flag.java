import java.util.List;

public class Flag extends Element implements ElementType{

    Color color;
    int carrierHeight;

    private List<Element> elements;

    public Flag(double width, double length, Color color, int carrierHeight, String path) {
        super(width, length, path);
        this.color = color;
        this.carrierHeight = carrierHeight;
        this.elements = List.of(ElementDetailsFactory.getPaintingElement(path));
    }
    @Override
    public void accept(ElementTypeVisitor elementTypeVisitor) {
        elementTypeVisitor.visit(this);
    }


 
    public Color getColor() {
        return color;
    }

    public int getCarrierHeight() {
        return carrierHeight;
    }

    @Override
    public String getName() {
        return Flag.class.getSimpleName().toLowerCase();
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }
}
