package structural.decorator;

//decorator class
public class EncryptedCloudStream implements Stream {

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String compressedData = encrypt(data);
        stream.write(compressedData);
    }

    private String encrypt(String data) {
        System.out.println("Running encryption");
        return "$*&!^@#^^(*!@&(#&(^$!@&";
    }

}
