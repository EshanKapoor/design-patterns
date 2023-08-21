package structural.proxy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        List<String> fileNames = List.of("a", "b", "c");
        for(String fileName : fileNames) {
            library.addEBook(new ProxyEBook(fileName));
        }

        library.openEBook("a");
    }
}
