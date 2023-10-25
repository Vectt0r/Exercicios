public class Grau {
    private String dataInicio;
    private String dataFim;

    public Grau() {
        this.dataInicio = null;
        this.dataFim = null;
    }

    public Grau(String dataInicio, String dataFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Data de Início: " + dataInicio + "\nData de Fim: " + dataFim;
    }
}
