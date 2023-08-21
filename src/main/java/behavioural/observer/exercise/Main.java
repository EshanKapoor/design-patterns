package behavioural.observer.exercise;

public class Main {
    public static void main(String[] args) {
        Stock zomato = new Stock("Zomato", 80.5f);
        Stock adani_wilmar = new Stock("Adani Wilmar", 227.0f);
        Stock asian_paints = new Stock("Asian Paints", 1000f);

        StatusBar statusBar = new StatusBar();
        statusBar.addStock(zomato);
        statusBar.addStock(adani_wilmar);

        StockListView stockListView = new StockListView();
        stockListView.addStock(zomato);
        stockListView.addStock(adani_wilmar);
        stockListView.addStock(asian_paints);

        statusBar.show();
        stockListView.show();

        zomato.setPrice(50f);
        adani_wilmar.setPrice(440f);
        asian_paints.setPrice(1500.54f);
    }
}
