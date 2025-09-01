import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.1 - Nome invertido
        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = sc.nextLine();
        System.out.print("Digite seu último nome: ");
        String ultimoNome = sc.nextLine();
        System.out.println(ultimoNome + ", " + primeiroNome + ".");
        System.out.println("--------------------------------");

        // 1.2 - Idade
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        int anoAtual = java.time.Year.now().getValue();
        int idade = anoAtual - anoNascimento;
        System.out.println("Sua idade é: " + idade + " anos.");
        System.out.println("--------------------------------");

        // 1.3 - Soma de dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        double soma = num1 + num2;
        System.out.println("A soma é: " + soma);
        System.out.println("--------------------------------");

        // 1.4 - Média de 5 notas
        double totalNotas5 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a nota " + i + ": ");
            totalNotas5 += sc.nextDouble();
        }
        double media5 = totalNotas5 / 5;
        System.out.println("A média das 5 notas é: " + media5);
        System.out.println("--------------------------------");

        // 1.5 - Média de 3 notas
        double totalNotas3 = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a nota " + i + ": ");
            totalNotas3 += sc.nextDouble();
        }
        double media3 = totalNotas3 / 3;
        System.out.println("A média das 3 notas é: " + media3);
        System.out.println("--------------------------------");

        // 1.6 - Valor por hora trabalhada
        System.out.print("Digite seu salário total: ");
        double salario = sc.nextDouble();
        System.out.print("Digite quantas horas você trabalha por dia: ");
        double horasPorDia = sc.nextDouble();
        double valorPorHora = salario / (22 * horasPorDia);
        System.out.println("Você recebe aproximadamente R$ " + valorPorHora + " por hora.");
        System.out.println("--------------------------------");

        sc.close();
    }
}

