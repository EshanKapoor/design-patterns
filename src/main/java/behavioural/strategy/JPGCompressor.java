package behavioural.strategy;

public class JPGCompressor implements Compressor {
    @Override
    public void compress() {
        System.out.println("Using JPGCompressor");
    }
}
