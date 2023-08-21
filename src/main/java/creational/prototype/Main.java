package creational.prototype;

public class Main {
    public static void main(String[] args) {
        ContextMenu contextMenu = new ContextMenu();
        contextMenu.duplicate(new Circle(9));
    }
}
