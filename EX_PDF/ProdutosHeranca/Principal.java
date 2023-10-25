/**
 * classe Principal
 * 
 * Silvana Teodoro
 *
 */
public class Principal
{
    public static void main (String args[])
    {
        int opcao;
        // cria 4 produtos
        Produto p1p = null;
        Produto p2p = null;
        Produto p1np = null;
        Produto p2np = null;
        do{
            System.out.println("-- Cadastro de Produtos ---"); 
            System.out.println("1-Perecível");
            System.out.println("2-Não Perecível");
            System.out.println("0-Sair");
            opcao = Teclado.leInt("Qual produto deseja criar? ");
            
            if (opcao == 1){
                System.out.println("-> Produtos Perecíveis");
                //public Perecivel(String n, String d, double v, Data dV)
                System.out.println("-> Produto 1");
                p1p = new Perecivel(Teclado.leString("Informe o nome do produto: "), Teclado.leString("Informe a descrição do produto: "),
                                         Teclado.leDouble("Informe o valor do produto: "), new Data(Teclado.leInt("Dia: "), Teclado.leInt("Mês: "), Teclado.leInt("Ano: ")));
                System.out.println("-> Produto 2");
                p2p = new Perecivel(Teclado.leString("Informe o nome do produto: "), Teclado.leString("Informe a descrição do produto: "),
                                         Teclado.leDouble("Informe o valor do produto: "), new Data(Teclado.leInt("Dia: "), Teclado.leInt("Mês: "), Teclado.leInt("Ano: ")));
            } else if (opcao == 2) {
                System.out.println("-> Produtos Não Perecíveis");
                //public NaoPerecivel(String n, String d, double v, Data dF)
                System.out.println("-> Produto 1");
                p1np = new NaoPerecivel(Teclado.leString("Informe o nome do produto: "), Teclado.leString("Informe a descrição do produto: "),
                                         Teclado.leDouble("Informe o valor do produto: "), new Data(Teclado.leInt("Dia: "), Teclado.leInt("Mês: "), Teclado.leInt("Ano: ")));
                System.out.println("-> Produto 2");
                p2np = new NaoPerecivel(Teclado.leString("Informe o nome do produto: "), Teclado.leString("Informe a descrição do produto: "),
                                         Teclado.leDouble("Informe o valor do produto: "), new Data(Teclado.leInt("Dia: "), Teclado.leInt("Mês: "), Teclado.leInt("Ano: ")));                        
           }
           System.out.println();
        } while(opcao!=0);
                     
        if (p1p.getValor() > p2p.getValor()) {
             System.out.println("\n-> Produto Perecível Mais Caro");
             System.out.println(p1p.toString());
        } else if (p2p.getValor() > p1p.getValor()) {
             System.out.println("-> Produto Perecível Mais Caro");
             System.out.println(p2p.toString());
        } else {
            System.out.println("-> Produtos Perecíveis possuem o mesmo valor: " + p1p.getValor());
        }
        
            //downcasting
        if ((((NaoPerecivel)p1np).getDataFabricacao()).getAno() < 2023){
            System.out.println("\n-> Produto Não Perecível");
            System.out.println((((NaoPerecivel)p1np).getDataFabricacao()).toString());
        } 
            //downcasting
        if ((((NaoPerecivel)p2np).getDataFabricacao()).getAno() < 2023){
            System.out.println("\n-> Produto Não Perecível");
            System.out.println((((NaoPerecivel)p2np).getDataFabricacao()).toString());
        } 
        
            //downcasting
        if (((Perecivel)p1p).verificaProdutoVencido(new Data(1,5, 2023))){
            System.out.println("\n-> Produto Perecível VENCIDO");
            System.out.println(p1p.toString());
        } else {
            System.out.println("\n-> Produto Perecível NÃO está VENCIDO");
            System.out.println(p1p.toString());
        }
        
            //downcasting
        if (((Perecivel)p2p).verificaProdutoVencido(new Data(1,5, 2023))){
            System.out.println("\n-> Produto Perecível VENCIDO");
            System.out.println(p2p.toString());
        } else {
            System.out.println("\n-> Produto Perecível NÃO está VENCIDO");
            System.out.println(p2p.toString());
        }
    }
}
