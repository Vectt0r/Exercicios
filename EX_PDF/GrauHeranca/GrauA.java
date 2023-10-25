public class GrauA extends Grau {
    private double notaTrabalho;
    private double notaProva;

    public GrauA(String dataInicio, String dataFim, double notaTrabalho, double notaProva) {
        super(dataInicio, dataFim);
        this.notaTrabalho = notaTrabalho;
        this.notaProva = notaProva;
    }

    public GrauA(double notaTrabalho, double notaProva) {
        super();
        this.notaTrabalho = notaTrabalho;
        this.notaProva = notaProva;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(double notaProva) {
        this.notaProva = notaProva;
    }

    public double calculaNotaFinalGrau() {
    return (notaTrabalho * 0.3) + (notaProva * 0.7);
    }

    @Override
    public String toString() {
        return "GrauA{" +
                "dataInicio='" + super.getDataInicio() + '\'' +
                ", dataFim='" + super.getDataFim() + '\'' +
                ", notaTrabalho=" + notaTrabalho +
                ", notaProva=" + notaProva +
                '}';
    }
}
