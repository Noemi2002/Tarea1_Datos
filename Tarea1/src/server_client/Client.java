package server_client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;




    public class Client extends Main_Window{




        public static void main(String[] args){
            Main_Window client_Window = new Main_Window();
            DataInputStream in;
            DataOutputStream out;
            try{
                Socket sc = new Socket("localhost", 8080);
                sc.close();

            } catch (Exception e) {
                e.printStackTrace();
            }



        }


    }

