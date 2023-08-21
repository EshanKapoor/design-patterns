package behavioural.mediator.using_observer.client;

import behavioural.mediator.using_observer.ArticlesDialogBox;

public class Main {
    public static void main(String[] args) {
        ArticlesDialogBox dialogBox = new ArticlesDialogBox();
        dialogBox.simulateUserInteraction();
    }
}
