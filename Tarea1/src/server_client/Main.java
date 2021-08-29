/**
 *
 * @author Noemí Vargas
 *
 * El programa consiste en un sistema pequeño cliente-servidor
 * se abren dos clientes y esto puede interactuar con el servidor simultaneamente
 *
 */

//Importations
package server_client;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;


public class Main extends JFrame {

    /**
     *
     * Esta clase crea dos instancias cliente y una servidor en un mismo run
     *
     */
    public static void main(String[] args) {

        client_window window1 = new client_window();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                client_window window2 = new client_window();
                window2.setLocation(650, 35);
                window2.setVisible(true);
            }
        });

        }
    }






