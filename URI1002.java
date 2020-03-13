//TUDO O QUE FOR COMENTADO É IGNORADO PELO PROGRAMA

// Mostra para o arquivo em qual pacote ele se encontra (OBRIGATÓRIO)
package marcelo_leite_junior;

// Importa a classe que recebe os dados do usuario (o URI)
import java.util.Scanner;

// Classe que inicia o arquivo
public class Marcelo_leite_junior {
// Lembrar de por espacos como abaixo:
    // Classe principal do programa (obrigatorio para rodar)
    // psvm + tab
    public static void main(String[] args) {
        //AREA = N * RAIO (AO QUADRADO)
        //N = 3.14159 (flutuante = double)
        //ENTRADA = RAIO (double - ponto flutuante dupla precisão)
        //SAÍDA = AREA (double)
        
        Scanner classeDeEntrada = new Scanner(System.in);
        
        double N = 3.14159d;
        double raio = classeDeEntrada.nextDouble();
        double area = N * (raio * raio);

        //sout
        System.out.println("A=" + String.format("%.4f", area));
        
    }
}
