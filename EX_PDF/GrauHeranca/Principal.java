public class Principal {

    public static void main(String[] args) {
        
        // pede ao usuário as informações da Turma e dos Alunos

        String codigo = Teclado.leString("Digite o código da turma:");
        
        Aluno aluno1 = criarAluno();
        Aluno aluno2 = criarAluno();
        Aluno aluno3 = criarAluno();
        
        // cria a Turma com as informações digitadas
        Turma turma = new Turma(codigo, aluno1, aluno2, aluno3);
        
        // imprime a média de notas da turma
        double mediaNotas = turma.mediaNotasTurma();
        if (mediaNotas == -1) {
            System.out.println("Não existem alunos na turma.");
        } else {
            System.out.printf("A média de notas da turma é %.2f\n", mediaNotas);
        }
        
        // verifica a aprovação de cada aluno
 
        double notaFinal = aluno1.calculaNotaFinal();
        if (notaFinal >= 6.0) {
            System.out.printf("Aluno %s: Passou por média!\n", aluno1.getNome());
        } else {
            System.out.printf("Aluno %s: Ficou em Grau C.\n", aluno1.getNome());
        }
        
        notaFinal = aluno2.calculaNotaFinal();
        if (notaFinal >= 6.0) {
            System.out.printf("Aluno %s: Passou por média!\n", aluno2.getNome());
        } else {
            System.out.printf("Aluno %s: Ficou em Grau C.\n", aluno2.getNome());
        }
        
        notaFinal = aluno3.calculaNotaFinal();
        if (notaFinal >= 6.0) {
            System.out.printf("Aluno %s: Passou por média!\n", aluno3.getNome());
        } else {
            System.out.printf("Aluno %s: Ficou em Grau C.\n", aluno3.getNome());
        }
    }
    
    // método auxiliar para criar um aluno com as informações digitadas
    private static Aluno criarAluno() {
        String nome = Teclado.leString("Digite o nome do aluno:");
        
        GrauA ga = criarGrauA();
        GrauB gb = criarGrauB();
        
        return new Aluno(nome, ga, gb);
    }
    
    // método auxiliar para criar um GrauA com as informações digitadas
    private static GrauA criarGrauA() {
        double notaTrabalho = Teclado.leDouble("Digite a nota do trabalho do Grau A:");
        double notaProva = Teclado.leDouble("Digite a nota da prova do Grau A:");
        return new GrauA(notaTrabalho, notaProva);
    }
    
    // método auxiliar para criar um GrauB com as informações digitadas
    private static GrauB criarGrauB() {

        double notaAtividades = Teclado.leDouble("Digite a nota de atividades do Grau B:");

        double notaSeminario = Teclado.leDouble("Digite a nota do seminário do Grau B:");

        double notaParticipacao = Teclado.leDouble("Digite a nota de participação do Grau B:");
        
        return new GrauB(notaAtividades, notaSeminario, notaParticipacao);
    }
}
