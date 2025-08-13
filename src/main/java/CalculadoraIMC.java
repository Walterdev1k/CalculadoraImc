package main.java;

     import java.util.Scanner;
     import java.util.Locale;

public class CalculadoraIMC {
    public static void main(String[] args) {
        // Configura o Scanner para usar ponto como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== CALCULADORA DE IMC ===");
        System.out.print("Digite seu peso em kg (ex: 70.5): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Determina a classificação
        String classificacao;
        if (imc <= 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc <= 24.9) {
            classificacao = "Peso ideal";
        } else if (imc <= 29.9) {
            classificacao = "Levemente acima do peso";
        } else if (imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc <= 39.9) {
            classificacao = "Obesidade Grau II (Severa)";
        } else {
            classificacao = "Obesidade III (Mórbida)";
        }

        // Exibe os resultados
        System.out.printf("\nSeu IMC é: %.2f%n", imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
