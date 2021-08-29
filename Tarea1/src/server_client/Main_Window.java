package server_client;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Main_Window extends JFrame{
    private JTextField chat_cost;
    private JTextField chat_weight;
    private JTextField chat_tax;


        public Main_Window() {
        serverr servidor1 = new serverr();
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


            JLabel instrucion = new JLabel();
            JLabel costLabel = new JLabel();
            JLabel weightLabel = new JLabel();
            JLabel taxLabel = new JLabel();

            instrucion.setText("Enter the data:");
            costLabel.setText("Product cost:");
            weightLabel.setText("Product weight:");
            taxLabel.setText("Product tax:");


            JTextArea seeMessages = new JTextArea();
            chat_cost = new JTextField();
            chat_weight = new JTextField();
            chat_tax = new JTextField();
            JButton called_button = new JButton("Start Transfer");


            seeMessages.setBounds(40, 10, 500, 350);
            seeMessages.setEditable(false);

            instrucion.setBounds(40, 360, 100, 50);
            costLabel.setBounds(60, 380, 100, 50);
            chat_cost.setBounds(70, 420, 300, 30);

            weightLabel.setBounds(60, 440, 100, 50);
            chat_weight.setBounds(70, 480, 300, 30);

            taxLabel.setBounds(60, 500, 100, 50);
            chat_tax.setBounds(70, 540, 300, 30);

            called_button.setBounds(380, 400, 180, 200);


            panel1.add(called_button);
            panel1.add(seeMessages);
            panel1.add(instrucion);
            panel1.add(costLabel);
            panel1.add(weightLabel);
            panel1.add(taxLabel);
            panel1.add(chat_cost);
            panel1.add(chat_weight);
            panel1.add(chat_tax);

            ActionListener escuchar_servidor = e -> {
                //if (Integer.valueOf(chat_cost.getText()) && Integer.valueOf(chat_tax.getText()) && Integer.valueOf(chat_weight.getText()) != int){
                  //  seeMessages.append("Los datos ingresados no son válidos");
                //}
                double num = servidor1.operation(Integer.valueOf(chat_cost.getText()),Integer.valueOf(chat_tax.getText()), Integer.valueOf(chat_weight.getText()));
                seeMessages.append("Los datos ingresados son:" +"\n");
                seeMessages.append("Precio del producto: "+ Integer.valueOf(chat_cost.getText())+"\n");
                seeMessages.append("Peso del producto: "+ Integer.valueOf(chat_weight.getText())+ "\n");
                seeMessages.append("Impuesto: "+ Integer.valueOf(chat_tax.getText())+ "%"+"\n");
                seeMessages.append("El monto final del producto es: "+ String.valueOf(num));
            };

            called_button.addActionListener(escuchar_servidor);
            this.setVisible(true);
        }



    }


