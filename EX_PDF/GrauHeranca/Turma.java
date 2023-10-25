public class Turma {
    private String codigo;
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;
    
    public Turma(String codigo, Aluno aluno1, Aluno aluno2, Aluno aluno3) {
        this.codigo = codigo;
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
        this.aluno3 = aluno3;
    }
    
    public double mediaNotasTurma() {
        double somaNotas = 0;
        int numAlunos = 0;
        
        if (aluno1 != null) {
            somaNotas += aluno1.calculaNotaFinal();
            numAlunos++;
        }
        
        if (aluno2 != null) {
            somaNotas += aluno2.calculaNotaFinal();
            numAlunos++;
        }
        
        if (aluno3 != null) {
            somaNotas += aluno3.calculaNotaFinal();
            numAlunos++;
        }
        
        if (numAlunos == 0) {
            return -1;
        } else {
            return somaNotas / numAlunos;
        }
    }
    
    public void alteraNotasGrauA(String nomeAluno, double notaTrabalho, double notaProva) {
        if (aluno1 != null && aluno1.getNome().equals(nomeAluno)) {
            aluno1.getGa().setNotaTrabalho(notaTrabalho);
            aluno1.getGa().setNotaProva(notaProva);
        } else if (aluno2 != null && aluno2.getNome().equals(nomeAluno)) {
            aluno2.getGa().setNotaTrabalho(notaTrabalho);
            aluno2.getGa().setNotaProva(notaProva);
        } else if (aluno3 != null && aluno3.getNome().equals(nomeAluno)) {
            aluno3.getGa().setNotaTrabalho(notaTrabalho);
            aluno3.getGa().setNotaProva(notaProva);
        }
    }
    
    public void alteraNotasGrauB(String nomeAluno, double notaAtividades, double notaSeminario, double notaParticipacao) {
        if (aluno1 != null && aluno1.getNome().equals(nomeAluno)) {
            aluno1.getGb().setNotaAtividades(notaAtividades);
            aluno1.getGb().setNotaSeminario(notaSeminario);
            aluno1.getGb().setNotaParticipacao(notaParticipacao);
        } else if (aluno2 != null && aluno2.getNome().equals(nomeAluno)) {
            aluno2.getGb().setNotaAtividades(notaAtividades);
            aluno2.getGb().setNotaSeminario(notaSeminario);
            aluno2.getGb().setNotaParticipacao(notaParticipacao);
        } else if (aluno3 != null && aluno3.getNome().equals(nomeAluno)) {
            aluno3.getGb().setNotaAtividades(notaAtividades);
            aluno3.getGb().setNotaSeminario(notaSeminario);
            aluno3.getGb().setNotaParticipacao(notaParticipacao);
        }
    }
}