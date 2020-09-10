package structural.decorator;

public class TreeTopper extends TreeDecorator {
    public TreeTopper(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String decorate() {
        return super.decorate() + decorateWithTreeTopper();
    }

    public String decorateWithTreeTopper() {
        return " with Tree Topper";
    }
}
