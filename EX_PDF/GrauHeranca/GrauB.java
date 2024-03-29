public class GrauB extends Grau {
    private double notaAtividades;
    private double notaSeminario;
    private double notaParticipacao;

    public GrauB(String dataInicio, String dataFim, double notaAtividades, double notaSeminario, double notaParticipacao) {
        super(dataInicio, dataFim);
        this.notaAtividades = notaAtividades;
        this.notaSeminario = notaSeminario;
        this.notaParticipacao = notaParticipacao;
    }

    public GrauB(double notaAtividades, double notaSeminario, double notaParticipacao) {
        super();
        this.notaAtividades = notaAtividades;
        this.notaSeminario = notaSeminario;
        this.notaParticipacao = notaParticipacao;
    }

    public double getNotaAtividades() {
        return notaAtividades;
    }

    public void setNotaAtividades(double notaAtividades) {
        this.notaAtividades = notaAtividades;
    }

    public double getNotaSeminario() {
        return notaSeminario;
    }

    public void setNotaSeminario(double notaSeminario) {
        this.notaSeminario = notaSeminario;
    }

    public double getNotaParticipacao() {
        return notaParticipacao;
    }

    public void setNotaParticipacao(double notaParticipacao) {
        this.notaParticipacao = notaParticipacao;
    }

    public double calculaNotaFinalGrau() {
    return (notaAtividades * 0.3) + (notaSeminario * 0.6) + (notaParticipacao * 0.1);
    }

    @Override
    public String toString() {
        return "GrauB{" +
                "dataInicio='" + getDataInicio() + '\'' +
                ", dataFim='" + getDataFim() + '\'' +
                ", notaAtividades=" + notaAtividades +
                ", notaSeminario=" + notaSeminario +
                ", notaParticipacao=" + notaParticipacao +
                '}';
    }
}
