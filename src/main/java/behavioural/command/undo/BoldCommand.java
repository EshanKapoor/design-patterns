package behavioural.command.undo;

public class BoldCommand implements UndoableCommand {
    private History history;
    private Editor editor;
    private String previousContent;

    public BoldCommand(History history, Editor editor) {
        this.history = history;
        this.editor = editor;
    }

    @Override
    public void execute() {
        previousContent = editor.getContent();
        editor.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        editor.setContent(previousContent);
    }
}
