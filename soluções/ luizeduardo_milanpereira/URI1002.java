import java.io.IOException;
 import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 Scanner classeENTRADA = new Scanner(System.in); 
        
        double N = 3.14159d;
        double raio = classeENTRADA.nextDouble(); 
        double area = N * raio * raio; 
        
        System.out.println("A=" + String.format("%.4f", area));
        
        
    }
 
}
