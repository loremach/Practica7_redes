import java.net.*;
import java.io.*;

public class ServidorTCP {
    public static void main(String args[]) throws IOException{
        ServerSocket ss = new ServerSocket(55555);
        Socket s = ss.accept(); //espero  que llegue un cliente. La ejecución de este método es bloqueante.
        // Se queda hasta que llegue un cliente y cuando llegue un cliente nos dara
        // como resultado una nueva conexion de tipo socket
        PrintWriter salida = new PrintWriter(s.getOutputStream(),true);
        salida.println("Bienvenido al servidor de pruena de Redes - Lorena Remacha");
        //salida.flush(); //no olvidar o poner el autolfush a true
        s.close();
        ss.close();//normalmente no se hace
    }
}
