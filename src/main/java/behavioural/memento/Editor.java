package behavioural.memento;

public class Editor {
    private String content;
    private String fontName;
    private int fontSize;

    //this is like when you want to save your state, you press ctrl + save on ms word and the state gets saved.
    public EditorState saveState() {
        return new EditorState(content, fontName, fontSize);
    }

    //this acts like undo, it loads the last state.
    public void restore(EditorState state) {
        content = state.getContent();
        fontName = state.getFontName();
        fontSize = state.getFontSize();
    }

    @Override
    public String toString() {
        return "Editor{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
