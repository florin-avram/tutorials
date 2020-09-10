package structural.decorator;

public class ChristmasLights extends TreeDecorator {
    public ChristmasLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String decorate() {
        return super.decorate() + decorateWithChristmasLights();
    }

    private String decorateWithChristmasLights() {
        return " with Christmas Lights";
    }
}
