package structural.decorator;

//decorator class
public class CompressedCloudStream implements Stream {

    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String compressedData = compress(data);
        stream.write(compressedData);
    }

    private String compress(String data) {
        System.out.println("Running compression");
        return data.substring(0, data.length() / 2);
    }

}
