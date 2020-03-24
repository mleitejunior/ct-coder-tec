import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     Scanner valorDeEntrada = new Scanner(System.in);
     int A = valorDeEntrada.nextInt();
     int B = valorDeEntrada.nextInt();
     int SOMA = A + B;
        System.out.println("SOMA = "+ SOMA); 
    }
 
}
