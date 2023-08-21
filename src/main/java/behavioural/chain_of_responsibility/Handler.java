package behavioural.chain_of_responsibility;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request) {
        if (!doHandle(request)) {
            return;
        }
        if (null != next) {
            next.handle(request);
        }
    }

    protected abstract boolean doHandle(HttpRequest request);
}
