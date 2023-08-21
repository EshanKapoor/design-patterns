package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, EBook> eBooks = new HashMap<>();

    public void addEBook(EBook eBook) {
        eBooks.put(eBook.getFileName(), eBook);
    }

    public void openEBook(String fileName) {
        eBooks.get(fileName).show();
    }
}
