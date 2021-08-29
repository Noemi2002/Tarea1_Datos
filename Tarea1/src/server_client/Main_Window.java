/**
 *
 * @author Noemí Vargas
 *
 * Esta clase contiene las características de la GUI
 *
 */

package server_client;

//Imports
import javax.swing.*;
import java.awt.event.ActionListener;

//Clase con aspectos generales de la vetana
public class Main_Window extends JFrame{

    //Variables
    private JTextField chat_cost;
    private JTextField chat_weight;
    private JTextField chat_tax;

        //Función con la ventana
        public Main_Window() {
        serverr servidor1 = new serverr(); //Se habilita el server

            //Aspectos generales
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

            //Creación de etiquetas
            JLabel instrucion = new JLabel();
            JLabel costLabel = new JLabel();
            JLabel weightLabel = new JLabel();
            JLabel taxLabel = new JLabel();

            //Texto de las etiquetas
            instrucion.setText("Enter the data:");
            costLabel.setText("Cost:");
            weightLabel.setText("Weight:");
            taxLabel.setText("Tax:");

            //Campos de texto
            JTextArea seeMessages = new JTextArea();
            chat_cost = new JTextField();
            chat_weight = new JTextField();
            chat_tax = new JTextField();
            JButton called_button = new JButton("Start Transfer");

            //Posiciones
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

            //Se agregan las etiquetas, el botón y los campos de texto
            panel1.add(called_button);
            panel1.add(seeMessages);
            panel1.add(instrucion);
            panel1.add(costLabel);
            panel1.add(weightLabel);
            panel1.add(taxLabel);
            panel1.add(chat_cost);
            panel1.add(chat_weight);
            panel1.add(chat_tax);

            //Función del botón
            ActionListener escuchar_servidor = e -> {

                {
                    try //En este try se verifica que los datos sean números
                    {
                        seeMessages.setText(null);
                        int peso =Integer.parseInt(chat_weight.getText());
                        int valor =Integer.parseInt(chat_cost.getText());
                        int impuesto =Integer.parseInt(chat_tax.getText());

                        double num = servidor1.operation(valor,impuesto, peso); //Si los datos son números, se envían a la función correspodiente

                        //Respuestas
                        seeMessages.setText("The data entered is:" +"\n");
                        seeMessages.append("Product price: "+ Integer.valueOf(chat_cost.getText())+"\n");
                        seeMessages.append("Product weight: "+ Integer.valueOf(chat_weight.getText())+ "\n");
                        seeMessages.append("Tax: "+ Integer.valueOf(chat_tax.getText())+ "%"+"\n");
                        seeMessages.append("The final product price is: "+ String.valueOf(num)+"\n\n");
                    }catch(NumberFormatException e1) //Si no son números manda un mensaje
                    {
                        JOptionPane.showMessageDialog(rootPane, "Enter only numbers");
                    }
                }
            };


            called_button.addActionListener(escuchar_servidor); //Se le agrega funcionalidad al botón
            this.setVisible(true); //Se hace visible la interfaz
        }



        }









