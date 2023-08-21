package behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage1 = new ImageStorage();
        imageStorage1.store("xyz", new JPGCompressor(), new BnWFilter());
        ImageStorage imageStorage2 = new ImageStorage();
        imageStorage2.store("xyz", new PNGCompressor(), new HighContrastFilter());
    }
}
