public class ElementsCountVisitor implements ElementTypeVisitor {
    int countOfElement = 0;

    public int getCountOfElement() {
        return countOfElement;
    }

    @Override
    public void visit(Kite kite) {
        countOfElement+=1;
    }

    @Override
    public void visit(Boat boat) {
        countOfElement+=1;
    }

    @Override
    public void visit(Flag flag) {
        countOfElement+=1;
    }

    @Override
    public void visit(Tree tree) {
        countOfElement+=1;
    }

    @Override
    public void visit(Kid kid) {
        countOfElement+=1;
    }

    @Override
    public void visit(Lake lake) {
        countOfElement+=1;
    }

    @Override
    public void visit(Island island) {
        countOfElement+=1;
    }
}
