import java.util.List;

public class Kid extends Element implements ElementType{
    private int birthYear;
    private Color hairColor;

    private List<Element> elements;

    public Kid(double width, double height, int birthYear, Color hairColor, String path) {
        super(width, height, path);
        this.birthYear = birthYear;
        this.hairColor = hairColor;
        this.elements = List.of(ElementDetailsFactory.getPaintingElement(path));
    }
    @Override
    public void accept(ElementTypeVisitor elementTypeVisitor) {
        for(Element element: elements)
            element.accept(elementTypeVisitor);
        elementTypeVisitor.visit(this);
    }


 
    public int getBirthYear() {
        return birthYear;
    }

    public Color getHairColor() {
        return hairColor;
    }

    @Override
    public String getName() {
        return "kid";
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AMPHIBIAN;
    }
}
