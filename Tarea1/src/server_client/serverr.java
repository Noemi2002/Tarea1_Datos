package server_client;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class serverr {

    static ServerSocket ss;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    


    private static double money(int value, int weigth, int tax, int port) {

        //Monto = (valor del producto * porcentaje / 100) + (peso del producto * 0,15)

        double operation;

        operation = (value * tax / 100) + (weigth * 0.15);
        return operation;

    }

    public static void money(double value, double weigth, double tax) {
    }


    }

