//Superclasse
public class Cadeira{
	private Cor cor; //Associação com a classe Cor == Atributo objeto do tipo da classe Cor
	private Aluno aluno; //Associação com a classe Aluno == Atributo objeto do tipo da classe Aluno
	
	public Cadeira(Cor cor){
		this.cor = cor;
	}
	
	public void setAluno(Aluno aluno){
		this.aluno = aluno;
	}
	
	public Aluno getAluno(){
		return this.aluno;
	}
	
	public Cor getCor(){
		return this.cor;
	}
	
	public String toString(){
		if(this.aluno != null) return "Cadeira " + this.cor.toString() + " - " + this.aluno.toString();
		else return "Cadeira (" + this.getClass().getName() + ") " + this.cor.toString() + " - vazia";
	}
}
