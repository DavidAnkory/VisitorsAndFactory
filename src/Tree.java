 
public class Tree extends Element implements ElementType{

    int leavesAmount;

    @Override
    public void accept(ElementTypeVisitor elementTypeVisitor) {
        elementTypeVisitor.visit(this);
    }
    public int getLeavesAmount() {
        return leavesAmount;
    }

    public Tree(double width, double height, int leavesAmount, String path) {
        super(width, height, path);
        this.leavesAmount = leavesAmount;
    }

    @Override
     public String getName() {
        return "tree";
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }
}
