public class Calculadora {
    private int numeroUm;
    private int numeroDois;

    public Calculadora(int numeroUm, int numeroDois){
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public int getNumeroUm() {
        return numeroUm;
    }
    public void setNumeroUm(int numeroUm) {
        this.numeroUm = numeroUm;
    }
    
    public int getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroDois(int numeroDois) {
        this.numeroDois = numeroDois;
    }

    public int Somar(){
        int resultadoSomar = getNumeroUm() + getNumeroDois();
        return resultadoSomar;
    }

    public int Multiplicar(){
        int resultadoMultiplicar = getNumeroUm() * getNumeroDois();
        return resultadoMultiplicar;
    }

    public int Dividir(){
        int resultadoDividir = getNumeroUm() / getNumeroDois();
        return resultadoDividir;
    }

    public int Subtrair(){
        int resultadoSubtrair = getNumeroUm() - getNumeroDois();
        return resultadoSubtrair;
    }

    public String DecimalParaBinario() {
        int resultadoSomarBin = getNumeroUm() + getNumeroDois();
        String binario = Integer.toBinaryString(resultadoSomarBin);
        return binario;
    }

    @Override
    public String toString() {
        return  "A soma dos números: " + Somar() + 
                "\nA Multiplicação dos numeros: " + Multiplicar() +
                "\nA Divisão dos numeros: " + Dividir() +
                "\nA Subtração dos numeros: " + Subtrair();
    }
    
}
