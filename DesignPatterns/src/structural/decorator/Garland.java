package structural.decorator;

public class Garland extends TreeDecorator {
    public Garland(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    public String decorateWithGarland() {
        return " with Garland";
    }
}
