//Subclasse
public class Jogo extends Presente
{
    //atributos
    private String Plataforma;
    private String Genero;
    
    /**
     * Construtor
     */
    public Jogo(int cod, String des, double val, int esc, String plat,String gen)
    {
        super(cod, des, val, esc);
        Plataforma = plat;
        Genero = gen;
    }
    
    //Métodos GETTERS
    public String getPlataforma()
    {
        return Plataforma;
    }
    
    public String getGenero()
    {
        return Genero;
    }
    
    //Métodos SETTERS
    public void setPlataforma(String plat)
    {
        Plataforma = plat;
    }
    
    public void setGenero(String gen)
    {
        Genero = gen;
    }
    
    //Método exibeDados sobrescrito
    public void exibeDados()
    {
        super.exibeDados();
        System.out.println("Plataforma: " + Plataforma);
        System.out.println("Gênero: " + Genero);
    } 
}
