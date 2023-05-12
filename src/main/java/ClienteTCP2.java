import java.net.*;
import java.io.*;
import java.util.Scanner;


public class ClienteTCP2 {
    public static void main(String args[]) throws UnknownHostException, IOException{

        Socket s = new Socket("10.11.61.1", 55555); //Puerto 80: conexion no segura, la conexión es transparente
        //Para conexión segura (información cifrada): puerto 443
        Scanner entrada = new Scanner(s.getInputStream());
        PrintWriter salida = new PrintWriter(s.getOutputStream());

        salida.println("Lorena Remacha Bordallo"); //El comando GET permite recuperar una página web
        //El código debe finalizar con dos pasos de línea para que se dé por aludido (\n -> código 10 -> salto de línea, \r ->código 13 -> retorno de carro)
        //salida.println("\r\n");
        salida.flush();//sale el mensaje

        System.out.println(entrada.nextLine());

        s.close();

    }
}
