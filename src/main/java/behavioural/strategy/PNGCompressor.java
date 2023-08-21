package behavioural.strategy;

public class PNGCompressor implements Compressor{
    @Override
    public void compress() {
        System.out.println("Using PNGCompressor");
    }
}
