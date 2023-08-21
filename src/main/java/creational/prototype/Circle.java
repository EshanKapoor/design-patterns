package creational.prototype;

public class Circle implements Component {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Rendering circle");
    }

    @Override
    public Component clone() {
        System.out.printf("Cloning circle of radius %d\n", radius);
        return new Circle(radius); //radius is copied from the circle object that calls clone method.
    }
}
