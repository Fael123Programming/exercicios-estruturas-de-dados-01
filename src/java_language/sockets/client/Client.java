package java_language.sockets.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable {
    private final int portToConnect;
    private final String serverIPAddress;

    public Client(int portToConnect, String hostIPAddress) {
        this.portToConnect = portToConnect;
        this.serverIPAddress = hostIPAddress;
    }

    @Override
    public void run() {
        try {
            Socket clientSocket = new Socket(serverIPAddress, portToConnect);
            System.out.println("Client has been connected to the server on port " + portToConnect);
            PrintStream printer = new PrintStream(clientSocket.getOutputStream());
            Scanner input = new Scanner(System.in);
            while (input.hasNextLine()) {
                printer.println(input.nextLine());
            }
            input.close();
            printer.close();
            clientSocket.close();
        } catch (IOException ioe) {
            System.out.println("An error occurred in method run() of class Client");
        }
    }
}
