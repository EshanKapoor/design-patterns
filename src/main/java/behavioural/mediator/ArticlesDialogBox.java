package behavioural.mediator;

public class ArticlesDialogBox extends DialogBox {

    private ListBox listBox = new ListBox(this);
    private TextBox textBox = new TextBox(this);
    private Button button = new Button(this);

    public void simulateUserInteraction() {
        listBox.setSelection("Article 1");
        textBox.setContent("");
        textBox.setContent("Article 2");
        System.out.println("Textbox : " + textBox.getContent());
        System.out.println("Button: "+ button.isEnabled());
    }

    @Override
    public void changed(UIControl uiControl) {
        if (uiControl == listBox) {
            articleSelected();
        } else if (uiControl == textBox) {
            textBoxChanged();
        }
    }

    private void textBoxChanged() {
        String content = textBox.getContent();
        boolean isEmpty = content == null || content.isEmpty();
        button.setEnabled(!isEmpty);
    }

    private void articleSelected() {
        textBox.setContent(listBox.getSelection());
        button.setEnabled(true);
    }
}
