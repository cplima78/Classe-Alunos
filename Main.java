public class Main {
    public static void main(String[] args) {
        //Nesse ponto inserimos as turmas definindo turma 1 ou 2//
        Turma turma1 = new Turma("Turma1", "T01");
        Turma turma2 = new Turma("Turma2", "T02");
        Aluno aluno1 = new Aluno("Carlos", 46, 01);
        Aluno aluno2 = new Aluno("Enzo", 22, 02);
        Aluno aluno3 = new Aluno("Beatriz", 21, 03);
        Aluno aluno4 = new Aluno("Larissa", 23, 04);
        Aluno aluno5 = new Aluno("André", 38, 05);

        //Selecionar a ordem de alunos crescente//
        turma1.addAluno(aluno1);
        turma2.addAluno(aluno2);
        turma2.addAluno(aluno3);
        turma1.addAluno(aluno4);
        turma1.addAluno(aluno5);

        System.out.println("turma1:");
        System.out.println(turma1.listarAlunos());
        System.out.println("turma2:");
        System.out.println(turma2.listarAlunos());

    }
}
