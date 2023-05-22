package org.example;

import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {
        String host = "localhost";
        int port = 8087;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())))
        {
            out.println("mail.ru");
            String resp = in.readLine();
            System.out.println(resp);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}