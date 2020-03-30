import java.io.IOException;
 import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner (System.in);
        
        int  NUMBER = sc.nextInt();
        int HOUR = sc.nextInt();
        double PRICE = sc.nextDouble();
        double SALARY = HOUR * PRICE;
        System.out.println("NUMBER = " + NUMBER);
        System.out.println("SALARY = U$ " + String.format("%.2f", SALARY));
 
    }
 
}
