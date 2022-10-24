package academy.devdojo.maratonajava.javacore.ExercicioAssociaco.teste;

import academy.devdojo.maratonajava.javacore.ExercicioAssociaco.domain.Aluno;
import academy.devdojo.maratonajava.javacore.ExercicioAssociaco.domain.Local;
import academy.devdojo.maratonajava.javacore.ExercicioAssociaco.domain.Professor;
import academy.devdojo.maratonajava.javacore.ExercicioAssociaco.domain.Seminario;

public class GerenciadorSeminario {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Tiago", 34);
        Aluno aluno02 = new Aluno("Rafal", 31);
        Aluno aluno03 = new Aluno("Thais", 29);
        Aluno aluno04 = new Aluno("Lucas", 2);
        Seminario seminario01 = new Seminario("Matemática");
        Seminario seminario02 = new Seminario("English");
        Seminario seminario03 = new Seminario("Química");
        Seminario seminario04 = new Seminario("Devops");
        Professor professor = new Professor("Amarildo",  "Especialista");

        Aluno[] alunosArray = new Aluno[]{aluno01, aluno02, aluno03, aluno04};
        Seminario[] seminariosArray = new Seminario[]{seminario01, seminario02, seminario03, seminario04};
        Local local = new Local("Avenida do Oratóio, 5660");





        aluno01.setSeminario(seminario01);
        aluno01.imprimeAluno();

        seminario01.setAlunos(alunosArray);
        seminario01.setLocal(local);
        seminario01.imprimeSeminario();

        professor.setSeminarios(seminariosArray);
        professor.imprimeProfessor();

        seminario02.setAlunos(alunosArray);
        seminario02.setLocal(local);
        seminario02.imprimeSeminario();







    }
}
