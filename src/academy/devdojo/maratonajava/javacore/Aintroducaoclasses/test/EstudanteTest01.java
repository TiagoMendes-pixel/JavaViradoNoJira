package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Tiago";
        estudante.idade = 34;
        estudante.sexo = 'M';

        System.out.println(estudante.nome + " " + estudante.idade + " " + estudante.sexo + " se acabou");
    }
}
