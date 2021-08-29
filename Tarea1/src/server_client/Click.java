package server_client;

//import server_client.serverr.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

public class Click {

    public Click() throws IOException {
        double value;
        double weigth;
        double tax;
        String ip;
        int port;

        String v;
        String pe;
        String pi;
        String p;
        serverr result;

        v = JOptionPane.showInputDialog("Ingrese el valor del producto: ");
        value = Integer.parseInt(v);
        pe = JOptionPane.showInputDialog("Ingrese el peso del producto: ");
        weigth = Integer.parseInt(pe);
        pi = JOptionPane.showInputDialog("Ingrese el porcentaje correspondiente a impuestos. Recuerde que debe ser un número entero: ");
        tax = Integer.parseInt(pi);

       // Socket client_socket=new Socket("localhost", port);
        //serverr.money(value, weigth, tax);
        //client_socket.close();

        //result = new serverr(value, weigth, tax);
    }
}
