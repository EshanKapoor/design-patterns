package behavioural.state;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
