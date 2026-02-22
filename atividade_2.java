import java.util.Scanner;

public class atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        int soma = 0;
        int i = 0;

        while (i < 4) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            if (sc.hasNextInt()) {
                numeros[i] = sc.nextInt();

                if (numeros[i] % 2 == 0) {
                    soma += numeros[i];
                }
                i++;
            } 
            else {
                System.out.println("Erro! Digite apenas números inteiros.");
                sc.next(); 
            }
        }
        System.out.println("\nSoma dos números pares: " + soma);
        sc.close();
    }
}