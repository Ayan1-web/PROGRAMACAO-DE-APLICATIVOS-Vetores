import java.util.Scanner;

public class atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] valores = new double[3];
        double soma = 0;
        int tentativas = 0;
        int i = 0;

        while (i < 3) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            tentativas++;
            if (sc.hasNextDouble()) {
                valores[i] = sc.nextDouble();
                soma += valores[i];
                i++;             
            } 
            else {
                System.out.println("Valor inválido! Digite um número.");
                sc.next(); 
            }
        }
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Quantidade de vezes que foi solicitado digitar: " + tentativas);
        sc.close();
    }
}