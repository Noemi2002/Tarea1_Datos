package server_client;
import javax.swing.*;
import java.awt.*;

public class server_window extends JFrame{
    private final int with = 650, height = 650;
    private final int x = 800;
    private final int y = 35;
    public server_window() {
        setTitle("Server");
        setSize(with, height);
        setLocation(x, y);
        setResizable(false);
    }
}

