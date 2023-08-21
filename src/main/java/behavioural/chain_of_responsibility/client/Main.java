package behavioural.chain_of_responsibility.client;

import behavioural.chain_of_responsibility.Authenticator;
import behavioural.chain_of_responsibility.Encryptor;
import behavioural.chain_of_responsibility.HttpRequest;
import behavioural.chain_of_responsibility.Logger;

public class Main {
    public static void main(String[] args) {
        HttpRequest request = new HttpRequest("admin", "123");
        Encryptor encryptor = new Encryptor(null);
        Logger logger = new Logger(encryptor);
        Authenticator authenticator = new Authenticator(logger);
        WebServer webServer = new WebServer(authenticator);
        webServer.handle(request);
    }


}
