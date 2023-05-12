package http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.time.LocalTime;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Http implements HttpHandler {

    private String[] nadimci;
    public Http(String[] nadimci) {
        this.nadimci = nadimci;
    }

    // "Zarkas", "Zarkan", "Zare", "Zarko", "Zvonkas", "Zvoničić", "Zvonac"
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        Random rand = new Random();
        int i = rand.nextInt(nadimci.length);
        String nadimak = nadimci[i];
        exchange.sendResponseHeaders(200, nadimak.length());
        OutputStream outputStream = exchange.getResponseBody();
        outputStream.write(nadimak.getBytes());
        outputStream.close();
    }

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(4000), 0);
        server.createContext("/nadimak", new Http(args));
        server.setExecutor(null);
        server.start();
    }
}
