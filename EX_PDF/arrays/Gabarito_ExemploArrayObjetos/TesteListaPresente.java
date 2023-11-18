public class TesteListaPresente
{
   public static void main(String args[])
   {
       ListaPresente lp = new ListaPresente(Teclado.leInt("Qual o tamanho de sua lista de Presentes: "));
       int opcao;
       
       do{
            //apresenta o menu
            System.out.println("\n\nSelecione uma opcao: ");
            System.out.println("1 – Adicionar Presente");
            System.out.println("2 – Visualizar todos os Presentes");
            System.out.println("3 – Visualizar todos os Presentes entre uma Faixa de Valor");
            System.out.println("4 – Pesquisar Presente");
            System.out.println("0 – Encerrar");
            opcao = Teclado.leInt(": ");
            
            switch(opcao){
               case 1:
                  System.out.println("\n\nAdicionar Presente");
                  int tipoPresente = Teclado.leInt("Digite 1 para Livro ou 2 para Jogo: ");
                   
                  Presente pr = null;
                  if(tipoPresente == 1){
                     pr = new Livro(Teclado.leInt("Digite o código do Livro: "),
                                    Teclado.leString("Digite o nome do Livro: "),
                                    Teclado.leDouble("Digite o valor do Livro: "),
                                    Teclado.leInt("Digite o quanto você deseja este Livro: 1-Não vivo sem este presente 2-Quero demais este presente 3-Este presente é legal"),
                                    Teclado.leString("Digite o autor do Livro: "),
                                    Teclado.leString("Digite a editora do Livro: "));

                   }else if(tipoPresente == 2){
                      pr = new Jogo(Teclado.leInt("Digite o código do Jogo: "),
                                    Teclado.leString("Digite o nome do Jogo: "),
                                    Teclado.leDouble("Digite o valor do Jogo: "),
                                    Teclado.leInt("Digite o quanto voc6e deseja este Jogo: 1-Não vivo sem este presente 2-Quero demais este presente 3-Este presente é legal"),
                                    Teclado.leString("Digite a plataforma do Jogo: "),
                                    Teclado.leString("Digite o gênero do Jogo: "));  
                   }
                   
                  lp.adicionaPresenteLista(pr);
                  break;
                case 2:
                    System.out.println("\n\nVisualizar todos os Presentes");
                    lp.visualizaListaPresentes();
                    break;
                case 3:
                    System.out.println("\n\nVisualizar todos os Presentes entre uma Faixa de Valor");
                    double val1 = Teclado.leInt("Digite o primeiro valor da faixa: ");
                    double val2 = Teclado.leInt("Digite o segundo valor da faixa: ");
                    lp.visualizaListaPresentesFaixaValor(val1, val2);
                    break;
                case 4:
                    System.out.println("\n\nPesquisar Presente");
                    String busca = Teclado.leString("Digite o nome do Presente a ser buscado: ");
                    lp.pesquisaPresente(busca);
                    break;
                case 0:
                    System.out.println("\n\nEncerrando o Sistema...");
                    break;
                 default:
                     System.out.println("\n\nOpção inválida!");
            }   
       }while(opcao!=0);
   }
}
