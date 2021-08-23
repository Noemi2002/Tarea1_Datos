package server_client;

import javax.swing.*;

public class client_window extends JFrame {
    private final int with = 400, height = 450;
    private final int x = 40;
    private final int y = 35;
    public client_window(){
        setTitle("Client");
        setLocation(x, y);
        setSize(with, height);
        setResizable(false);
    }


}
