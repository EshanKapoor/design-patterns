package behavioural.memento;

import java.util.Stack;

public class History {
    private Stack<EditorState> editorState = new Stack<>();

    public void push(EditorState state) {
        editorState.add(state);
    }

    public EditorState pop() {
        if(editorState.size() == 0)
            throw new IllegalStateException("Nothing to undo anymore");
        return  editorState.pop();
    }
}
