package main;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;

/**
 * Created by eddy on 19/11/2016.
 */

public class Boot {
    public static void main(String[]args){
        Vertx vertx = Vertx.vertx();

        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type", "text/html")
                    .end("Hello from Vert.x!");
        }).listen(8080);
    }

}
