import java.net.*;
import java.io.*;
import java.util.Scanner;



public class ProtocoloQOTD {
    public static void main(String args[]) throws UnknownHostException, IOException {
        for (Integer i = 1; i<10;i++){
            Socket s = new Socket("djxmmx.net", 17);
            Scanner entrada = new Scanner(s.getInputStream());
            System.out.println(entrada.nextLine());
            s.close();
        }
    }
}
