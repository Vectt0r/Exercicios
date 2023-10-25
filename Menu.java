public class Menu {
    public static void Repetidor(int escolha, int[] array, int[] array1) {
        int resultado = 0;
        switch (escolha) {
            case 1:
                resultado = array[0] + array1[0];
                break;
            case 2:
                resultado = array[0] - array1[0];
                break;
            case 3:
                resultado = array[0] / array1[0];
                break;
            case 4:
                resultado = array[0] * array1[0];
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }

        if (resultado < 0) {
            resultado = 0;
            System.out.println("Valor menor que zero");
        }

        System.out.println("Resultado: " + resultado);
    }
}

