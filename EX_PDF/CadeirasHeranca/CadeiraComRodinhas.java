//Subclasse
public class CadeiraComRodinhas extends Cadeira{
	private Data dataUltimaManutencao; //Associação com a classe Data == Atributo objeto do tipo da classe Data
	
	public CadeiraComRodinhas(Cor cor, Data dataUltimaManutencao){
		super(cor); //chama o construtor da superclasse Cadeira
		this.dataUltimaManutencao = dataUltimaManutencao;
	}
	
	public Data getDataUltimaManutencao(){
		return this.dataUltimaManutencao;
	}
	
	//Sobrescrita
	public String toString(){
		return super.toString() + " / Última manutenção: " + dataUltimaManutencao.toString();
	}
}
