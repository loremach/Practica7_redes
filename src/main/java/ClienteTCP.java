import java.net.*;
import java.io.*;
import java.util.Scanner;


public class ClienteTCP {
    public static void main(String args[]) throws UnknownHostException, IOException{
//        Socket s = new Socket("zoltar.redes.upv.es", 21); //puerto 21 porque queremos cnectarnos con un servidor TCP
//        Scanner entrada = new Scanner(s.getInputStream()); //nos envía un mensaje de bienvenida. Vinculamos con el flujo de entrada de datos
//        System.out.println(entrada.nextLine());
//        s.close();//cerramos conexion con el servidor

        //NO FUNCIONA! Está esperando la conexión y finalmente falla. Razón: el servidor se ha cerrado


        Socket s = new Socket("test.rebex.net", 21); //puerto 21 porque queremos cnectarnos con un servidor TCP
        Scanner entrada = new Scanner(s.getInputStream()); //nos envía un mensaje de bienvenida. Vinculamos con el flujo de entrada de datos
        System.out.println(entrada.nextLine());
        s.close();//cerramos conexion con el servidor

        //Código 100 = informativo
        //Código 300 = falta información
        //Código 400 = ha habido algún error que se puede superar
        //Código 500: error sin solucion
        //Código 200 = todo ha ido bien
    }
}
