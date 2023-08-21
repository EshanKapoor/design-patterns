package behavioural.observer.pushstyle;

public class Main {
    public static void main(String[] args) {
        Datasource datasource = new Datasource(5);

        Spreadsheet spreadSheet1 = new Spreadsheet();
        Spreadsheet spreadSheet2 = new Spreadsheet();
        Chart chart = new Chart();

        datasource.addObserver(spreadSheet1);
        datasource.addObserver(spreadSheet2);
        datasource.addObserver(chart);

        datasource.setValue(10);
    }
}
