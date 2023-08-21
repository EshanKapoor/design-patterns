package behavioural.observer.pullstyle;

public class Main {
    public static void main(String[] args) {
        Datasource datasource = new Datasource(5);

        Spreadsheet spreadSheet1 = new Spreadsheet(datasource);
        Spreadsheet spreadSheet2 = new Spreadsheet(datasource);
        Chart chart = new Chart(datasource);

        datasource.addObserver(spreadSheet1);
        datasource.addObserver(spreadSheet2);
        datasource.addObserver(chart);

        datasource.setValue(12);
    }
}
