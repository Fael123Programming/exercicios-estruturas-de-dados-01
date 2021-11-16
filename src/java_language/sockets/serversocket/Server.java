package java_language.sockets.serversocket;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server implements Runnable {
    private final int portToOpen;
    private String iPAddress;

    public Server(int port) {
        this.portToOpen = port;
    }

    @Override
    public void run() {
        //Opening a server through first, opening a gate.
        try {
            ServerSocket server = new ServerSocket(portToOpen);
            //10 is the gate being opened.
            //They are from 0 to 65535.
            System.out.println("Gate " + portToOpen + " opened");
            System.out.println("Server's local port: " + server.getLocalPort());
            System.out.println("Server's host address: " + server.getInetAddress().getHostAddress());
            iPAddress = server.getInetAddress().getHostAddress();
            Socket client = server.accept();
            //The method above blocks the current thread of being executed till a client
            //connects with this server on that port.
            System.out.println("New connection with " + client.getInetAddress().getHostAddress());
            //After client has been connected...
            //We can access all information transferred from client...
            System.out.println("Received data --------------------------------------------------------------------");
            Scanner input = new Scanner(client.getInputStream());
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
            //Closing connections...
            input.close();
            //Calling the method above will close the input stream returned by client.getInputStream().
            //Closing that input stream also closes its respective socket.
            server.close();
        } catch (IOException ioe) {
            System.out.println("An error occurred in method run() of class Server");
        }
    }

    public int getPortToOpen(){
        return portToOpen;
    }

    public String getIPAddress(){
        return iPAddress;
    }
}
