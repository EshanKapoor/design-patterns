package behavioural.chain_of_responsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        if (request.getUserName().equals("admin") && request.getPassword().equals("123")) {
            System.out.println("Authentication Success!");
            return true;
        }
        return false;
    }
}
