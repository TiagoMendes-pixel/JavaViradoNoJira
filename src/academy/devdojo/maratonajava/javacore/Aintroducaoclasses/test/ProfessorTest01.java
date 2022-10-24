package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor prof = new Professor();

        prof.nome = "Tiago";
        prof.idade = 34;
        prof.sexo = 'M';

        System.out.println(prof.nome + " " + prof.idade + " " + prof.sexo);

    }
}
