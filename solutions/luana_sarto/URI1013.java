import java.io.IOException;
import static java.lang.Math.abs;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        //scanner
        Scanner sc = new Scanner(System.in);
        
        //variáveis
        int A, B, C, MAIOR, MAIOR2;
        
        //Entrada
    	A = sc.nextInt(); B = sc.nextInt(); C = sc.nextInt();
        
        //Processamento
        MAIOR = (( A + B + abs(A-B))/2);
        MAIOR2 = (( MAIOR + C + abs(MAIOR-C))/2);
        
        //Saída
        System.out.println(MAIOR2 + " eh o maior");


    }
} 
