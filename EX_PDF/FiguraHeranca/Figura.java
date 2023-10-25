//Classe abstrata não pode ser instanciada/criar objetos com o new Figura
//O objetivo é que ela sirva apenas como modelo/superclasse para a crição de subclasses
//Essas subclasses poderão instanciar/criar objetos a partir delas new Circulo e new Retangulo
public abstract class Figura {
    private double x;
    private double y;
    
    // Construtor sem parâmetros
    public Figura() {
        this.x = 0;
        this.y = 0;
    }
    
    // Construtor com parâmetros
    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Métodos get e set para o atributo x
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    // Métodos get e set para o atributo y
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    //método abstrato significa que a implementação do corpo será nas subclasses apenas
    public abstract double calculaArea();
    
    // Método toString para a classe Figura
    @Override
    public String toString() {
        return "Figura [x=" + x + ", y=" + y + "]";
    }
}
