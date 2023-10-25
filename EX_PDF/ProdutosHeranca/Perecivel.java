/**
 * Subclasse Perecivel 
 * 
 * Silvana Teodoro 
 * 
 */
public class Perecivel extends Produto
{
    // variáveis de instância
    private Data dataValidade; //associação entre classes

    /**
     * Construtor para objetos da subclasse Perecivel
     */
    public Perecivel(String n, String d, double v, Data dV)
    {
        // inicializa variáveis de instância
       super(n, d, v); //chamada ao construtor da superclasse Produto
       dataValidade = dV;
    }
    
    //get
    public Data getDataValidade()
    {
        return dataValidade;
    }
    
    //set
    public void setDataValidade(Data dV)
    {
        dataValidade = dV;
    }
    
    /**
     * Retorna o false se o produto não está vencido de acordo com a dataRecebida e a dataValidade.
     * Retorna o true se o produto está vencido de acordo com a dataRecebida.
     */
    public boolean verificaProdutoVencido(Data dataRecebida){
        //dataValidade       dataRecebida
        //dia/mes/ano 	     diaR/marR/anoR
        //12/05/2023 	          
        if(dataRecebida.getAno() < dataValidade.getAno()) //20/06/2022 
           return false;
        else if(dataRecebida.getAno() == dataValidade.getAno()) 
             if(dataRecebida.getMes() < dataValidade.getMes()) //20/04/2023
         	return false;	
             else if(dataRecebida.getMes() == dataValidade.getMes()) 
                  if(dataRecebida.getDia() <= dataValidade.getDia())  //10/05/2023
                     return false;	
    
        return true; //20/06/2024   //12/06/2023 //20/05/2023 
    }
    
    //polimorfismo sobrescrita
    public String toString(){
        return(super.toString() + "\nData de Validade: " + dataValidade.toString());
    }
    
}
