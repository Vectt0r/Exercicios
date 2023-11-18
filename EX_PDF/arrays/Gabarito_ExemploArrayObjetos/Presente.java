//Superclasse
public abstract class Presente
{
    //atributos
    private int codigo;
    private String descricao;
    private double valor;
    private int escalaDesejo;
    
    /**
     * Construtor
     */
    public Presente(int cod, String des, double val, int esc)
    {
        //inicializa os atributos com os valores dos parametros
        codigo = cod;
        descricao = des;
        valor = val;
        escalaDesejo = esc;
    }

    //Métodos GET para todos os atributos
    public int getCodigo()
    {
        return codigo;
    }
    
    public String getDescricao()
    {
        return descricao;
    }
    
    public double getValor()
    {
        return valor;
    }
    
    public String getEscalaDesejo()
    {
        if(escalaDesejo==1)
            return "Não vivo sem este presente";
        else if(escalaDesejo==2)
            return "Quero demais este presente";
        else
            return "Este presente é legal";
    }
    
    //Métodos SET para todos os atributos
    public void setCodigo(int cod)
    {
        codigo = cod;
    }
    
    public void setDescricao(String desc)
    {
        descricao = desc;
    }
    
    public void setValor(double val)
    {
        valor = val;
    }
    
    public void setEscalaDesejo(int esc)
    {
        escalaDesejo = esc;
    }
    
    //Método exibeDados
    public void exibeDados()
    {
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Escala de Desejo: " + getEscalaDesejo());
    }
}
