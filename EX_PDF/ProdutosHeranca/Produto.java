/**
 * Superclasse Produto 
 * 
 * Silvana Teodoro
 */
public class Produto
{
    // variáveis de instância
    private String nome;
    private String descricao;
    private double valor;

    /**
     * Construtor para objetos da superclasse Produto
     */
    public Produto(String n, String d, double v)
    {
        // inicializa variáveis de instância
        nome = n;
        descricao = d;
        valor = v;
    }

    //getters
    public String getNome(){
        return nome;
    }
    
    public double getValor(){
        return valor;
    }
    
    //setters
    public void setNome(String n){
        nome = n;
    }
    
    public void setValor(double v){
        valor = v;
    }
    
    public String toString(){
        return("Nome: " + nome + "\nDescrição: " + descricao + "\nValor: " + valor);
    }
}
