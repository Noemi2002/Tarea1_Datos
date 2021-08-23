/**
 *
 * @author Noemí Vargas
 *
 */

package server_client;
import javax.swing.*;


public class Main {
    private static server_window window2;
    private static client_window window1;

    public static void main(String[] args){
        windows();
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


        private static void create_button(){
            JButton called_button = new JButton();
            called_button.setBounds(0, 0, 1, 2);
            window1.add(called_button);
        }





}