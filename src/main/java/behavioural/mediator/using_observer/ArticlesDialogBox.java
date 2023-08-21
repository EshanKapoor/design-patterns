package behavioural.mediator.using_observer;

public class ArticlesDialogBox {

    private ListBox listBox = new ListBox();
    private TextBox textBox = new TextBox();
    private Button button = new Button();

    //The only difference here while implementing the observer pattern is that, although this class has all the concrete subjects, but it does not implement
    //Observer interface - because we don't want just 1 update method but more - depending upon how many different observers will be required.
    //So, we use anonymous inner classes/lambdas to do it.
    //Since we have all the concrete subjects here in this class, it is better to define all the logic in the same class.
    //Now, we only want to add the observer classes whose update method will be called when notifyObservers() is called by any Subject class.
    public ArticlesDialogBox() {
        listBox.add(new Observer() {
            @Override
            public void update() {
                articleSelected();
            }
        });

        textBox.add(new Observer() {
            @Override
            public void update() {
                textBoxChanged();
            }
        });
    }

    public void simulateUserInteraction() {
        listBox.setSelection("Article 1");
        textBox.setContent("");
        textBox.setContent("Article 2");
        System.out.println("Textbox : " + textBox.getContent());
        System.out.println("Button: "+ button.isEnabled());

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
