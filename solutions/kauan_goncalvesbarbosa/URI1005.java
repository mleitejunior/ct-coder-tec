import java.io.IOException;
 import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
         
        Scanner sc = new Scanner (System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double MEDIA = (A*3.5 + B*7.5)/11;
        
        System.out.println("MEDIA = " + String.format("%.5f", MEDIA));
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 
    }
 
}
