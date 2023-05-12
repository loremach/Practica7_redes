import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServidorTCP2 {
    public static void main(String args[]) throws IOException {
        ServerSocket ss = new ServerSocket(55555);
        Socket s = ss.accept();
        Scanner entrada = new Scanner(s.getInputStream());
        Integer m = entrada.nextInt();
        PrintWriter salida = new PrintWriter(s.getOutputStream());
        salida.println("Bienvenido a la tabla de multiplicar - Lorena Remacha");
        for(Integer i = 1; i<=10; i++){
            salida.println(m + "x" + i + "=" + m*i);
        }
        salida.flush(); //no ponemos el autoflush a true porque nos mandará cada
        // mensaje por separado, en lugar de la tabla completa en un solo segmento
        s.close();
        ss.close();//normalmente no se hace
    }
}
