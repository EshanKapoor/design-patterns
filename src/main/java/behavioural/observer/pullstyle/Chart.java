package behavioural.observer.pullstyle;

public class Chart implements Observer {
    private Datasource datasource;

    public Chart(Datasource datasource) {
        this.datasource = datasource;
    }

    @Override
    public void update() {
        System.out.println("Chart updated : " + datasource.getValue());
    }
}
