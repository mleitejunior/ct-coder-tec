import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int numFuncionario = sc.nextInt();
        int horas = sc.nextInt();
        float salary = sc.nextFloat();

        System.out.println("NUMBER = " + numFuncionario);

        float total = (salary * horas);

        System.out.printf("SALARY = U$ %.2f\n", total);
 
    }
 
}
