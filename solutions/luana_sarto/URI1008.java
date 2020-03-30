import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

	    int NumFu = sc.nextInt();
	    int NumH = sc.nextInt();
        float SLP = sc.nextFloat();

    	float SALARY = (SLP*NumH);
                
    	System.out.println("NUMBER = " + NumFu);
        System.out.println("SALARY = U$ " + String.format("%.2f", SALARY));
 
    }
 
}
