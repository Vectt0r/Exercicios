/**
 * Subclasse NaoPerecivel 
 * 
 * Silvana Teodoro
 * 
 */
public class NaoPerecivel extends Produto
{
    // variáveis de instância
    private Data dataFabricacao; //associação entre classes

    /**
     * Construtor para objetos da subclasse NaoPerecivel
     */
    public NaoPerecivel(String n, String d, double v, Data dF)
    {
        // inicializa variáveis de instância
        super(n, d, v); //chamada ao construtor da superclasse Produto
        dataFabricacao = dF;
    }

    //get
    public Data getDataFabricacao()
    {
        return dataFabricacao;
    }
    
    //set
    public void setDataFabricacao(Data dF)
    {
        dataFabricacao = dF;
    }
    
    //polimorfismo sobrescrita
    public String toString(){
        return(super.toString() + "\nData de Fabricação: " + dataFabricacao.toString());
    }
}
