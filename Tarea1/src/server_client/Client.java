/**
 *
 * @author Noemí Vargas
 *
 * Esta clase habilita la conexión con sockets desde el cliente
 *
 */

package server_client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;



    //Clase Cliente
    public class Client extends Main_Window{




        public static void main(String[] args){
            try{
                Socket sc = new Socket("localhost", 8080); //Se abre un socket para la comunicación
                sc.close();

            } catch (Exception e) { //En caso de error de comunicación
                e.printStackTrace();
            }



        }


    }

