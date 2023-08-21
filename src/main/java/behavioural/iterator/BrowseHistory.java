package behavioural.iterator;

public class BrowseHistory {
    //private List<String> urls = new ArrayList<>();

    private String[] urls = new String[3];
    private int i = -1;

    public void push(String url) {
        //urls.add(url);

        if(i < urls.length - 1) {
            urls[++i] = url;
        } else {
            throw new IllegalStateException("Capacity reached! Cannot store more urls.");
        }
    }

    public String pop() {
        //int lastIndex = urls.size() - 1;
        //return urls.remove(lastIndex);

        if(i >= 0) {
            int lastIndex = urls.length - 1;
            i--;
            return urls[lastIndex];
        }
        throw new IllegalStateException("History is already empty.");
    }

    public Iterator<String> createIterator() {
        return new ArrayIterator<>(this);
    }

    /*private class ListIterator<T> implements Iterator<T> {
        private BrowseHistory browseHistory = new BrowseHistory();
        private int index;

        public ListIterator(BrowseHistory browseHistory) {
            this.browseHistory = browseHistory;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public T current() {
            return (T) urls.get(index);
        }

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }
    }*/

    private class ArrayIterator<T> implements Iterator<T> {
        private BrowseHistory browseHistory = new BrowseHistory();
        private int index;

        public ArrayIterator(BrowseHistory browseHistory) {
            this.browseHistory = browseHistory;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public T current() {
            return (T) urls[index];
        }

        @Override
        public boolean hasNext() {
            return index < urls.length;
        }
    }

}
