//Subclasse
public class Livro extends Presente
{
    //atributos
    private String Autor;
    private String Editora;
    
    /**
     * Construtor
     */
    public Livro(int cod, String des, double val, int esc, String au,String ed)
    {
        super(cod, des, val, esc);
        Autor = au;
        Editora = ed;
    }
    
    //Métodos GETTERS
    public String getAutor()
    {
        return Autor;
    }
    
    public String getEditora()
    {
        return Editora;
    }
    
    //Métodos SETTERS
    public void setAutor(String au)
    {
        Autor = au;
    }
    
    public void setEditora(String ed)
    {
        Editora = ed;
    }
    
    //Método exibeDados sobrescrito
    public void exibeDados()
    {
        super.exibeDados();
        System.out.println("Autor: " + Autor);
        System.out.println("Editora: " + Editora);
    }
}
