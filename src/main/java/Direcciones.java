import java.net.*;
import java.io.*;

public class Direcciones {
    public static void main (String[] args){
        InetAddress direccion;
        try{
            direccion = InetAddress.getLocalHost();
            System.out.println("dirección = InetAddress.getLocalHost()");
            System.out.println("dirección = "+direccion);
            System.out.println("dirección.getHostName() = "+direccion.getHostName());
            System.out.println("dirección.getHostAddress() = "+direccion.getHostAddress());

            System.out.println();
            direccion = InetAddress.getByName("www.unirioja.es");
            System.out.println("dirección = InetAddress.getLocalHost()");
            System.out.println("dirección = "+direccion);
            System.out.println("dirección.getHostName() = "+direccion.getHostName());
            System.out.println("dirección.getHostAddress() = "+direccion.getHostAddress());


            InetAddress[] direcciones = InetAddress.getAllByName("www.toyota.com");
            for(InetAddress d:direcciones){
                System.out.println(d);
            }

            String[] servidores = {"www.elpais.com", "www.elmundo.es", "www.okdiario.es", "www.abc.es"};
            for(String servidor:servidores){
                direcciones = InetAddress.getAllByName(servidor);
                for(InetAddress d:direcciones){
                    System.out.println(d);
                }
            }

        }catch (UnknownHostException e) {
            System.out.println("Incapaz de determinar esta dirección de host");
        }
    }
}
