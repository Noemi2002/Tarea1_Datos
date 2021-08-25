package server_client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class client_window extends JFrame {
    private final int with = 600, height = 650;
    private final int x = 40;
    private final int y = 35;
    private JPanel panel1;


    public client_window() {
        setTitle("Client / Server");
        setLocation(x, y);
        setSize(with, height);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1 = new JPanel();
        panel1.setLayout(null); //Desactivar el diseño del panel
        add(panel1);
        setVisible(true);

        JButton called_button = new JButton("Start Transfer");
        called_button.setBounds(115, 350, 160, 30);
        called_button.setEnabled(true); //El botón está encendido para interactuar con él
        panel1.add(called_button);

        ActionListener escuchando = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int value;
                int weigth;
                int tax;

                String v;
                String pe;
                String pi;

                v = javax.swing.JOptionPane.showInputDialog("Ingrese el valor del producto: ");
                value = Integer.parseInt(v);

                pe = javax.swing.JOptionPane.showInputDialog("Ingrese el peso del producto: ");
                weigth = Integer.parseInt(pe);

                pi = javax.swing.JOptionPane.showInputDialog("Ingrese el porcentaje correspondiente a impuestos. Recuerde que debe ser un número entero: ");
                tax = Integer.parseInt(pi);


            }
        };

        called_button.addActionListener(escuchando);

    }

    }

