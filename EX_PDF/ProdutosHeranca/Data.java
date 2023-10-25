/**
 * Classe Data
 * 
 * Silvana Teodoro
 * 
 */
public class Data
{
    // variáveis de instância
    private int dia;
    private int mes;
    private int ano;
    
    // Construtor para objetos da classe Data
    public Data(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }
    
    //getters
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    //setters
    public void setDia(int novoDia){
        dia  = novoDia;
    }
    
    public void setMes(int novoMes){
        mes = novoMes;
    }
    
    public void setAno(int novoAno){
        ano = novoAno;
    }
    
    public String toString(){
       return(dia + "/" + mes + "/" + ano);
    }
}