//Subclasse
public class CadeiraComMesa extends Cadeira{
	private double largura, profundidade;
	
	public CadeiraComMesa(Cor cor, double largura, double profundidade){
		super(cor); //chama o construtor da superclasse Cadeira
		this.largura = largura;
		this.profundidade = profundidade;
	}
	
	public double getLargura(){
		return this.largura;
	}
	
	public double getProfundidade(){
		return this.profundidade;
	}
	
	//Sobrescrita
	public String toString(){
		return super.toString() + " / "  + profundidade + "cm profundidade e " + largura + "cm largura";
	}
}
