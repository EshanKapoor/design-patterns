package behavioural.observer.pushstyle;

public class Spreadsheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("SpreadSheet updated : " + value);
    }
}
