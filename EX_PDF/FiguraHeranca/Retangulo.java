public class Retangulo extends Figura {
    private double base;
    private double altura;

    public Retangulo(double x, double y, double base, double altura) {
        super(x, y); //chama o segundo construtor da superclasse
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double base, double altura) {
        super(); //chama o primeiro construtor da superclasse
        this.base = base;
        this.altura = altura;
    }

    public Retangulo() {
        super(); //chama o primeiro construtor da superclasse
        this.base = 0;
        this.altura = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Sobrescrita
    public double calculaArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Retangulo [base=" + base + ", altura=" + altura + ", x=" + getX() + ", y=" + getY() + "]";
    }
}
