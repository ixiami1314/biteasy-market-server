package com.biteasy.market.handler;

import com.biteasy.pb3.SearchRequestOuterClass;
import org.webbitserver.BaseWebSocketHandler;
import org.webbitserver.WebSocketConnection;

/**
 * Created by weijun on 16/3/24.
 */
public class OParkWebSocketHandler extends BaseWebSocketHandler {

    private int connectionCount;

    @Override
    public void onOpen(WebSocketConnection connection) throws Exception {
        System.out.println ("- biteasy market server openning ...");
        super.onOpen(connection);
    }

    @Override
    public void onClose(WebSocketConnection connection) throws Exception {
        System.out.println ("- biteasy market server closed !");
        connection.send ("主收到信息了");
        super.onClose(connection);
    }

    @Override
    public void onMessage(WebSocketConnection connection, String msg) throws Throwable {
        System.out.println("- biteasy market server, message is " + msg);
        super.onMessage(connection, msg);
    }

    @Override
    public void onMessage(WebSocketConnection connection, byte[] msg) throws Throwable {
        System.out.println("- biteasy market server, message is " + msg.toString());
        connection.send("主收到信息了");
        SearchRequestOuterClass.SearchRequest request = SearchRequestOuterClass.SearchRequest.parseFrom (msg);
        System.out.println("- request is " + request.getQurey());

        SearchRequestOuterClass.SearchRequest request1 = SearchRequestOuterClass.SearchRequest.newBuilder()
                .setQurey ("走起")
                .setResultPerPage (3)
                .setPageNumber (2)
                .build ();
        connection.send(request1.toByteArray ());
        super.onMessage(connection, msg);
    }

    @Override
    public void onPing(WebSocketConnection connection, byte[] msg) throws Throwable {
        super.onPing(connection, msg);
    }

    @Override
    public void onPong(WebSocketConnection connection, byte[] msg) throws Throwable {
        super.onPong(connection, msg);
    }
}
