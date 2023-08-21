package creational.prototype;

public class ContextMenu {
    public void duplicate(Component component) {
        Component clone = component.clone();
        //Add this new clone to document.
    }
}
