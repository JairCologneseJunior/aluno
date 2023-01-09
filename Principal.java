package aluno;
/* Consatruir uma aplicação de cáculo de notas de um aluno, sabendo que ele pode ser aluno da Univille ou da UFSC,
que possuem formas de avaliação diferente. Mostrar os dados e a média do aluno
*/
public class Principal {
    public static void main(String[] args) {

        AlunoUFSC aluno1 = new AlunoUFSC();
        AlunoUFSC aluno = new AlunoUFSC(1.4, 6.4, 7.8);
        aluno1.setNomeAluno("Jaíne Kohn");
        aluno1.setMatricula("2022-35435");
        aluno1.setProva1(4.5);
        aluno1.setProva2(7.8);
        aluno1.setProva3(5.6);

        System.out.println(aluno1.getNomeAluno());
        System.out.println(aluno1.getMatricula());

        System.out.println(aluno1.toString());
        aluno1.calcMedia();

        AlunoUniville aluno2 = new AlunoUniville();
        aluno2.setNomeAluno("Julia Kohn");
        aluno2.setMatricula("20222-54645");
        aluno2.setProva1(1.4);
        aluno2.setProva2(7.8);
        aluno2.setProva3(8.5);
        System.out.println(aluno2.getNomeAluno());
        System.out.println(aluno2.getMatricula());

        System.out.println(aluno2.toString());
        aluno2.calcMedia();
    }

}