package org.sid.server;

import jakarta.xml.ws.Endpoint;
import org.sid.ws.EtudiantWService;

public class ServerWS {
    public static void main(String[] args) {
        String url="http://localhost:8081/";
        Endpoint.publish(url,new EtudiantWService());
        System.out.println(url);
    }
}
