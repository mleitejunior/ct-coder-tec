import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        int valor = sc.nextInt();
        int hora = valor / 3600;
        int hora2 = valor - (hora * 3600);
        int minuto = hora2 / 60;
        int segundo = hora2 - (minuto * 60);
        System.out.println( hora + ":" + minuto + ":" + segundo);
    
    }
 
}
