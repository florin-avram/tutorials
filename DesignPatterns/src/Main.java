import structural.decorator.ChristmasLights;
import structural.decorator.ChristmasTree;
import structural.decorator.ChristmasTreeImpl;
import structural.decorator.Garland;

public class Main {
    public static void decoratorPatternExample() {
        System.out.println("=========== Decorator pattern example ===========");
        ChristmasTree simpleChristmasTree = new ChristmasTreeImpl();
        System.out.println(simpleChristmasTree.decorate());

        ChristmasTree christmasTreeWithLights = new ChristmasLights(new ChristmasTreeImpl());
        System.out.println(christmasTreeWithLights.decorate());

        ChristmasTree christmasTreeWithGarland = new Garland(new ChristmasTreeImpl());
        System.out.println(christmasTreeWithGarland.decorate());

        ChristmasTree christmasTreeWithGarlandAndLights = new Garland(new ChristmasLights(new ChristmasTreeImpl()));
        System.out.println(christmasTreeWithGarlandAndLights.decorate());
        System.out.println("=========== End of Decorator pattern example ===========");
    }
    public static void main(String[] args) {
        decoratorPatternExample();
    }
}
