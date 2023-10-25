public class Circulo extends Figura {
    private double raio;
    
    // Construtor sem parâmetros
    public Circulo() {
        super();//chama o primeiro construtor da superclasse
        this.raio = 0;
    }
    
    // Construtor com um parâmetro (raio)
    public Circulo(double raio) {
        super();//chama o primeiro construtor da superclasse
        this.raio = raio;
    }
    
    // Construtor com dois parâmetros (x e y das coordenadas)
    public Circulo(double x, double y, double raio) {
        super(x, y);//chama o segundo construtor da superclasse
        this.raio = raio;
    }
    
    // Métodos get e set para o atributo raio
    public double getRaio() {
        return raio;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    // Método toString para a classe Circulo
    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", " + super.toString() + "]";
    }
    
    // Sobrescrita: Método para calcular a área do círculo
    public double calculaArea() {
        return 3.14 * raio * raio;
    }
}
