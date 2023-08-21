package behavioural.command.undo;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setContent("Hello World");

        History history = new History();
        BoldCommand boldCommand = new BoldCommand(history, editor);
        boldCommand.execute();
        System.out.println(editor.getContent());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(editor.getContent());
    }
}
