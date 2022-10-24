package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Tiago";
        estudante01.idade = 34;
        estudante01.sexo = 'M';

        estudante02.nome = "Thais";
        estudante02.idade = 28;
        estudante02.sexo = 'F';


        estudante01.imprimeEstudante();
        estudante02.imprimeEstudante();

    }
}
