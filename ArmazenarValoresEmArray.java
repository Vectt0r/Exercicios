import java.util.Scanner;

public class ArmazenarValoresEmArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;

        while (continuar){
                System.out.println("\nPrimeiro Numero: ");
                int valor1 = scanner.nextInt();

                System.out.println("Segundo Numero: ");
                int valor2 = scanner.nextInt();
                
                System.out.println("Selecione uma Operação:");
                System.out.println("1 - '+'");
                System.out.println("2 - '-'");
                System.out.println("3 - '/'");
                System.out.println("4 - '*'");

                int escolha = scanner.nextInt();

                int[] array = {valor1, valor2};
                int[] array1 = {valor2};

                Repetidor(escolha, array, array1);
                System.out.println("Continuar? ('s' para sim e outra tecla para não.");
                String resposta = scanner.next();

                if(!resposta.equalsIgnoreCase("s")){
                    continuar = false;
                }
            
        }
        scanner.close();
    }

    public static void Repetidor(int escolha, int[] array, int[] array1) {
        switch(escolha) {
            case 1:
                int somar = array[0] + array1[0];
                System.out.println("Soma dos valores: " + somar);
                if (somar < 0) {
                    somar = 0;
                    System.out.println("Valor menor que zero");
                }
            case 2:
                int subtrair = array[0] - array1[0];
                if (subtrair < 0) {
                    subtrair = 0;
                    System.out.println("Valor menor que zero");
                } else {
                    System.out.println("Subtração dos Valores: " + subtrair);
                }
                break;
            case 3: 
                int dividir = array[0] / array1[0];
                if (dividir < 0) {
                    dividir = 0;
                    System.out.println("Valor menor que zero");
                } else {
                    System.out.println("Divisão dos Valores: " + dividir);
                }
                break;
            case 4:
                int multiplicar = array[0] * array1[0];
                if (multiplicar < 0) {
                    multiplicar = 0;
                    System.out.println("Valor menor que zero");
                } else {
                    System.out.println("Multiplicação dos Valores: " + multiplicar);
                }
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}
