import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPrimeiro Numero: ");
        int valor1 = scanner.nextInt();

        System.out.println("Segundo Numero: ");
        int valor2 = scanner.nextInt();

        Calculadora calcular = new Calculadora(valor1, valor2);
        System.out.println(calcular.toString());        // System.out.println("A soma dos números: " + valor1 + " + " + valor2 + " é " + calcular.Somar());
        // System.out.println("A Multiplicação dos números: " + valor1 + " x " + valor2 + " é " + calcular.Multiplicar());
        // System.out.println("A Divisão dos números: " + valor1 + " / " + valor2 + " é " + calcular.Dividir());
        // System.out.println("A Subtração dos números: " + valor1 + " - " + valor2 + " é " + calcular.Subtrair());
        // System.out.println("A representação binária: " + calcular.DecimalParaBinario());
    }
}


