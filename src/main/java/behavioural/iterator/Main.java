package behavioural.iterator;

public class Main {
    public static void main(String[] args) {
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");
        //browseHistory.push("d"); Overflow

        //changing the type of iterator from List to Array or vice-versa doesn't affect this class. That is implementation logic which is internal to BrowseHistory
        //class. templatemethod.client.Main class is using BrowseHistory class but doesn't break by any changes.
        Iterator<String> iterator = browseHistory.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }

        browseHistory.pop();
        browseHistory.pop();
        browseHistory.pop();

        browseHistory.push("d");
        browseHistory.push("e");

        iterator = browseHistory.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }

        browseHistory.pop();
    }
}
