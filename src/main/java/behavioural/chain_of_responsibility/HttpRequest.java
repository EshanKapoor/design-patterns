package behavioural.chain_of_responsibility;

public class HttpRequest {
    private String userName;
    private String password;

    public HttpRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
