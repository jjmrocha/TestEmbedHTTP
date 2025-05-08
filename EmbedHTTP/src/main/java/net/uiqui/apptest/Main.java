package net.uiqui.apptest;

import net.uiqui.embedhttp.HttpServer;
import net.uiqui.embedhttp.Router;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger("MAIN");

    public static void main(String[] args) throws InterruptedException {
        var api = new AppAPI();
        var router = Router.newRouter()
                .get("/resource/:id", api::fetch);

        var server = HttpServer.newInstance(9090);

        if (!server.start(router)) {
            logger.severe("Server is not running");
        }
    }

}
