package structural.proxy;

public class ProxyEBook implements EBook{
    private String fileName;
    private RealEBook realEBook;

    public ProxyEBook(String fileName) {
        this.fileName = fileName;
    }

    //When show is called on proxy, it then creates object of RealEBook and the Ebook gets loaded into memory.
    //This is lazy initialization. Object is created only when proxy classes' show method is called.
    @Override
    public void show() {
        if(realEBook == null) {
            realEBook = new RealEBook(fileName);
        }

        realEBook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
