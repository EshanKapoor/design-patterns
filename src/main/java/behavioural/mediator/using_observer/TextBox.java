package behavioural.mediator.using_observer;

public class TextBox extends UIControl {
    private String content;

    public TextBox() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }
}
