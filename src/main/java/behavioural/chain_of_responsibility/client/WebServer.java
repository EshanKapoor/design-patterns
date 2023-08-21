package behavioural.chain_of_responsibility.client;

import behavioural.chain_of_responsibility.Handler;
import behavioural.chain_of_responsibility.HttpRequest;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request) {
        handler.handle(request);
    }
}
