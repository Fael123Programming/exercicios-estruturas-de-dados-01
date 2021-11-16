package java_language.sockets;

import java_language.sockets.client.Client;
import java_language.sockets.serversocket.Server;

//import java.net.*;
//java.net is the basic API to use when making talkative applications in Java (client -> server).

public class Main {
    public static void main(String[] args) {
        //A socket is a bidirectional mechanism used to connect two points in
        //a data communication.
        //A protocol is a language in which machines use to communicate and 
        //exchange information (bytes). TCP (Transmission Control Protocol) is
        //that protocol which ensures that all information being transferred from
        //one machine to another will arrive safely and reliably.
        //Through TCP, you can create a stream between computers in
        //an IP-addressed network.
        //We have only one physical connection but through it multiple
        //applications communicate; all of them is identified uniquely.
        //To do that, each computer have their gates: each app use a gate
        //to move data to and fro.
        //A gate is a value of 2 Bytes: varies from 0 to 65535.
        //If all of them are occupied, then it is impossible to communicate
        //with that machine!
        //http standard gate is 80.
        //An application address is made of: anIPAddress:specificGate;
        //To make that many clients can communicate at the same time, a specific
        //gate is used to only "receive the guests". After being accepted, the client
        //is moved to another gate. It allows multiple connections meanwhile!!!
        //In Java, this mechanism is done by threads (multiple execution lines).
        Server server = new Server(10);
        Client client = new Client(server.getPortToOpen(), server.getIPAddress());
        Thread serverTrigger = new Thread(server);
        Thread clientTrigger = new Thread(client);
        serverTrigger.start();
        clientTrigger.start();
    }
}
