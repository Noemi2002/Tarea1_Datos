package server_client;

//Importaciones
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class client_window extends JFrame {

    public client_window() {
        this.setTitle("Client");

        int x = 40;
        int y = 35;
        this.setLocation(x, y);

        int width = 600;
        int height = 650;
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
        JButton sendButton = new JButton("Send message");
        JButton called_button = new JButton("Start Transfer");


        seeMessages.setBounds(40, 10, 500, 350);
        seeMessages.setEditable(false);
        time.setBounds(40, 360, 100, 50);
        chatting.setBounds(50, 400, 300, 30);
        sendButton.setBounds(400, 400, 125, 30);
        called_button.setBounds(115, 500, 160, 30);


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

        called_button.addActionListener(escuchar_servidor);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        client_window window1 = new client_window();
    }

}

