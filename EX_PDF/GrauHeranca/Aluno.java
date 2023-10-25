public class Aluno {
    private String nome;
    private GrauA ga;
    private GrauB gb;

    public Aluno(String nome, GrauA ga, GrauB gb) {
        this.nome = nome;
        this.ga = ga;
        this.gb = gb;
    }

    public String getNome() {
        return nome;
    }

    public GrauA getGa() {
        return ga;
    }

    public GrauB getGb() {
        return gb;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGa(GrauA ga) {
        this.ga = ga;
    }

    public void setGb(GrauB gb) {
        this.gb = gb;
    }

    public double calculaNotaFinal() {
    double notaFinalGrauA = ga.calculaNotaFinalGrau();
    double notaFinalGrauB = gb.calculaNotaFinalGrau();
    return (notaFinalGrauA * 0.33) + (notaFinalGrauB * 0.67);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ga=" + ga +
                ", gb=" + gb +
                '}';
    }
}
