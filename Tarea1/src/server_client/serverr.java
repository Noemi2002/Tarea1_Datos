/**
 *
 * @author Noemí Vargas
 *
 * Esta clase habilita la conexión con sockets desde el servidor
 *
 */

package server_client;

//Imports
import java.net.ServerSocket;
import java.net.Socket;

//Clase servidor
public class serverr{
    public static void main(String[] args){
        ServerSocket servidor = null; //socket del servidor
        Socket sc = null; //socket del cliente
        try {
            servidor = new ServerSocket(8080); //Si no hay ningún error el servidor se va a conectar con este puerto

            while(true){
                sc = servidor.accept(); //En cuanto se habilite un cliente el servidor va a acceptarlo
                sc.close();

            }

        } catch (Exception e) {
            e.printStackTrace(); //Por aquello de algún error de conexión que pueda manejarlo
        }


    }

    //Función que realiza la operación
    //Recibe tres valores númericos: precio, peso e impuesto
    //La reestricción es que solo acepta números.
    public double operation(int value, int tax, int weigth) {
        double result;

        result = (value * tax / 100) + (weigth * 0.15);
        return result;
    }
}



