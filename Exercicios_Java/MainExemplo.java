public class MainExemplo {

    // Classe Interna

    public static class Pessoa{
        private int idade;

        public Pessoa(int idade){
            this.idade = idade;
        }

        public void testaIdade(){
            if(idade < 18){
                System.out.print("menor de idade");
            }else{
                System.out.print("maior de idade");
            }
        }

    // Classe Externa

    public static void main(String[] args){
        //Instancia da Classe interna
        Pessoa classeExemplo = new Pessoa(18);
        classeExemplo.testaIdade();

        }

    }
}