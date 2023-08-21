package behavioural.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        editor.setFontName("Times New Roman");
        editor.setFontSize(4);
        history.push(editor.saveState());

        editor.setContent("b");
        editor.setFontSize(2);
        history.push(editor.saveState());

        editor.setContent("c");
        editor.setFontName("Arial");//you can do but no need to save state here since now if we call history.pop(), we should get back content as "b" as it was the last state

        editor.restore(history.pop());
        System.out.println(editor);

        editor.restore(history.pop());
        System.out.println(editor);
    }
}
