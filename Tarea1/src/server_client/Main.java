/**
 *
 * @author Noemí Vargas
 *
 * El programa consiste en un sistema pequeño cliente-servidor
 * se abren dos clientes y un servidor. Los clientes van a poder interactuar con el servidor simultaneamente.
 *
 * Solo se tiene que ejecuar la clase Main, ella tiene conexiones con las otras clases y todo se va a ejecutar.
 *
 */

//Imports
package server_client;
import javax.swing.*;
import java.io.IOException;


//Clase principal
public class Main {

    //Est método crea una instancia servidor y dos clientes
    public static void main(String[] args) throws IOException {
        serverr servidor2 = new serverr();
        Main_Window window1 = new Main_Window();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main_Window window2 = new Main_Window();
                window2.setLocation(650, 35);
                window2.setVisible(true);
            }
        });

        }
    }






