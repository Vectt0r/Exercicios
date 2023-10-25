import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Random rand = new Random(); //cria um objeto da classe Random para sortear números
        Figura figuras[] = new Figura[4]; //cria um array de tamanho 4 que poderá armazenar 
        //4 Figuras (de qualquer subclasse), uma em cada índice: figuras[0], figuras[1], figuras[2] e figuras[3]

        for (int i = 0; i < 4; i++) {
            if (rand.nextBoolean()) { //sorteia ou o valor booleano true ou false
                // sorteia circulo
                double raio = rand.nextDouble() * 10; //sorteia um valor double entre 0 e 1 e depois multiplica por 10 para aumentar o valor
                figuras[i] = new Circulo(rand.nextDouble() * 100, rand.nextDouble() * 100, raio);
            } else {
                // sorteia retangulo
                double base = rand.nextDouble() * 10;
                double altura = rand.nextDouble() * 10;
                figuras[i] = new Retangulo(rand.nextDouble() * 100, rand.nextDouble() * 100, base, altura);
            }
        }

        for (int i = 0; i < 4; i++) {
            if (figuras[i] instanceof Circulo) { //instanceof verifica se o objeto neste índice foi insrtanciado da classe Circulo
                System.out.printf("Círculo com raio %.2f tem área %.2f\n", ((Circulo) figuras[i]).getRaio(),
                        figuras[i].calculaArea());
            } else {
                System.out.printf("Retângulo com base %.2f e altura %.2f tem área %.2f\n",
                        ((Retangulo) figuras[i]).getBase(), ((Retangulo) figuras[i]).getAltura(),
                        figuras[i].calculaArea());
            }
        }
    }
}
