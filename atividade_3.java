import java.util.Scanner;

public class atividade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nDigite o primeiro valor: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Valor inválido!");
                sc.next();
                continue;
            }
            double num1 = sc.nextDouble();

            System.out.print("Digite o segundo valor: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Valor inválido!");
                sc.next();
                continue;
            }
            double num2 = sc.nextDouble();

            System.out.print("Digite o símbolo da operação (+, -, *, /, **) ou EXIT para sair: ");
            String simbolo = sc.next();

            if (simbolo.equalsIgnoreCase("EXIT")) {
                System.out.println("Programa encerrado.");
                break;
            }
            switch (simbolo) {
                case "+":
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Divisão não pode ser feita (denominador zero).");
                    } else {
                        System.out.println("Resultado: " + (num1 / num2));
                    }
                    break;
                case "**":
                    System.out.println("Resultado: " + Math.pow(num1, num2));
                    break;
                default:
                    System.out.println("Impossível realizar a operação.");
            }
        }
        sc.close();
    }
}