package behavioural.observer.pullstyle;

public class Spreadsheet implements Observer {
    private Datasource datasource;

    public Spreadsheet(Datasource datasource) {
        this.datasource = datasource;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet updated : " + datasource.getValue());
    }
}
