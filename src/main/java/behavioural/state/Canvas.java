package behavioural.state;

public class Canvas {
    private Tool tool;

    public Canvas(Tool tool) {
        this.tool = tool;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public void mouseDown() {
        /*if (currentTool == ToolType.SELECTION) {
            System.out.println("Selection icon");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Brush icon");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("Eraser icon");
        }*/
        tool.mouseDown();
    }

    public void mouseUp() {
       /* if (currentTool == ToolType.SELECTION) {
            System.out.println("Draw dashed rectangle");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Draw a line");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("Erase something");
        }*/
        tool.mouseUp();
    }
}
