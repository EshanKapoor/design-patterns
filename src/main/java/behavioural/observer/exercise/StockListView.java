package behavioural.observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stock.addObserver(this);
        stocks.add(stock);
    }

    @Override
    public void update() {
        show();
    }

    public void show() {
        System.out.println("Prices on Stock List View");
        for (var stock : stocks)
            System.out.println(stock);
    }
}
