/**
 *
 * @author Noemí Vargas
 *
 */

package server_client;
import javax.swing.*;
import java.awt.*;


public class Main {
    private static server_window window2;
    private static client_window window1;
    private static JPanel panel1;
    private static JPanel panel2;

    public static void main(String[] args){
        windows();
        panels();
        create_button();
    }


    private static void windows(){
        window2 = new server_window();
        window2.setVisible(true);
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        window1 = new client_window();
        window1.setVisible(true);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void panels(){
        panel1 = new JPanel();
        panel1.setLayout(null); //Desactivar el diseño del panel
        panel1.setBackground(Color.cyan);
        window1.add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(null); //Desactivar el diseño del panel
        panel2.setBackground(Color.pink);
        window2.add(panel2);

    }

    private static void create_button(){
        JButton called_button = new JButton("Start Transfer");
        called_button.setBounds(115, 150, 160, 30);
        called_button.setEnabled(true); //El botón está encendido para interactuar con él
        panel1.add(called_button);
    }





}