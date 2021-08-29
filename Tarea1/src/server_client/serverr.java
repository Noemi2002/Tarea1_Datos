package server_client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;

public class serverr{
    public static void main(String[] args){
        ServerSocket servidor = null;
        Socket sc = null;
        try {
            servidor = new ServerSocket(8080);

            while(true){
                sc = servidor.accept();
                sc.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public double operation(int value, int tax, int weigth) {
        double result;

        result = (value * tax / 100) + (weigth * 0.15);
        return result;
    }
}



