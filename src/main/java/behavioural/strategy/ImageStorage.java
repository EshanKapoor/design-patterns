package behavioural.strategy;

public class ImageStorage {
    /*private Compressor compressor;
    private Filter filter;*/

    //It is much better to pass these objects directly to store method. We would also not need the instance variables anymore!
    /*public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }*/

    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress();
        filter.apply();
        System.out.println("Storing file : " + fileName);
    }
}
