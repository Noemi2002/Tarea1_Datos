package server_client;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class serverr extends JFrame{
    static ServerSocket ss;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;

    public serverr (){
        this.setTitle("Server");

        int x = 600;
        int y = 35;
        this.setLocation(x, y);

        int width = 300;
        int height = 350;
        this.setSize(width, height);

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        panel1.setLayout(null); //Desactivar el diseño del panel
        this.add(panel1);



        JTextArea seeMessages = new JTextArea();
        JLabel time = new JLabel();
        time.setText("Time to chat:");
        JTextField chatting = new JTextField();
        JButton sendButton = new JButton("Send");
        JButton called_button = new JButton("Start Transfer");


        seeMessages.setBounds(10, 5, 250, 200);
        seeMessages.setEditable(false);
        time.setBounds(10, 200, 80, 50);
        chatting.setBounds(10, 235, 150, 30);
        sendButton.setBounds(170, 235, 100, 30);
        called_button.setBounds(55, 270, 160, 30);


        panel1.add(called_button);
        panel1.add(seeMessages);
        panel1.add(time);
        panel1.add(sendButton);
        panel1.add(chatting);

        ActionListener escuchar_servidor = e -> {

            try {
                new Click();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        };



        ActionListener enviar_mensaje = e -> {

            try{
                String msg_out = "";
                msg_out = chatting.getText().trim();
                dout.writeUTF(msg_out);
            } catch (Exception ioException) {
                ioException.printStackTrace();
            }

        };
        called_button.addActionListener(escuchar_servidor);
        sendButton.addActionListener(enviar_mensaje);
        this.setVisible(true);


        String msg = "";
        try{
            ss = new ServerSocket(8089); //El server se inicializa en este puerto
            s= ss.accept(); //El server acepta las conexiones
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            while(!msg.equals("exit")){
                msg = din.readUTF();
                seeMessages.setText(seeMessages.getText().trim()+"\n"+msg); // mostrar el mensaje desde el cliente
            }

        }catch(Exception e){

        }





        /*private static double money(int value, int weigth, int tax, int port) {

            //Monto = (valor del producto * porcentaje / 100) + (peso del producto * 0,15)

            double operation;

            operation = (value * tax / 100) + (weigth * 0.15);
            //return operation;

        }*/


        }
    public static void main(String[] args) {
        serverr server1 = new serverr();
    }

}

