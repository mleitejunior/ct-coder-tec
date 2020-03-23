import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        //scanner
        Scanner sc = new Scanner(System.in);
        
        //variáveis
        int A, B, SOMA;
        
        //entrada
        A = sc.nextInt();
        B = sc.nextInt();
        
        //processamento e saída
        System.out.println("SOMA = " + (SOMA = A + B));
        
    }
 
}
