import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        // Criação do scanner para leitura de dados do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita a entrada do número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        // Verifica se o número é negativo ou não
        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

        // Fecha o scanner
        sc.close();
    }
}
