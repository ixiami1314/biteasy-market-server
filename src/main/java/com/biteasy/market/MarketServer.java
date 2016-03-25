package com.biteasy.market;

import com.biteasy.market.handler.OParkWebSocketHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.webbitserver.WebServer;
import org.webbitserver.WebServers;
import org.webbitserver.handler.StaticFileHandler;

/**
 * Created by weijun on 16/3/24.
 */
public class MarketServer {

    public static void main (String [] args) throws Exception {

        ApplicationContext ac = new ClassPathXmlApplicationContext ("classpath:/META-INF/spring/*.xml");

        WebServer webServer = WebServers.createWebServer (8080)
                .add (new StaticFileHandler("/Users/weijun/workspace-biteasy/biteasy-market-server/src/test/webapp"))
                .add ("/markets", new OParkWebSocketHandler ())
                .start()
                .get ();
    }
}
