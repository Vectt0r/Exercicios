public class ListaPresente
{
    //atributos
    private Presente listaPresentes[];
    private int contador;
    
    /**
     * Construtor
     */
    public ListaPresente(int tamanho)
    {
        //inicialize aqui o array de presentes
        listaPresentes = new Presente[tamanho];
    }
    
    public void adicionaPresenteLista(Presente pres){
        listaPresentes[contador++] = pres;
        System.out.println("\nPresente Adicionado a Lista!");
        pres.exibeDados();
    }
    
    public void visualizaListaPresentes(){
        for(int i=0; i < contador; i++)
        {
              if(listaPresentes[i] instanceof Livro){
                 System.out.println("-- Livro -- ");
                 listaPresentes[i].exibeDados();
                 System.out.println("");
              } else if(listaPresentes[i] instanceof Jogo){
                 System.out.println("-- Jogo -- ");
                 listaPresentes[i].exibeDados();
                 System.out.println("");
              }
        }
    }
    
    public void visualizaListaPresentesFaixaValor(double valor1, double valor2){
          for(int i=0; i < contador; i++)
          {
              if((listaPresentes[i].getValor() >= valor1) && (listaPresentes[i].getValor() <= valor2)){
                 if(listaPresentes[i] instanceof Livro){
                     System.out.println("-- Livro -- ");
                     listaPresentes[i].exibeDados();
                     System.out.println("");
                 } else if(listaPresentes[i] instanceof Jogo){
                     System.out.println("-- Jogo -- ");
                     listaPresentes[i].exibeDados();
                     System.out.println("");
                }
              }
          }
    }
    
    public void pesquisaPresente (String descricao){
        for(int i=0; i < contador; i++)
        {
            if((listaPresentes[i].getDescricao()).equalsIgnoreCase(descricao)){
                listaPresentes[i].exibeDados();
                System.out.println("");
            }
        }
    }
}
