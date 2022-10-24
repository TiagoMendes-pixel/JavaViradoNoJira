package academy.devdojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula07Arrays {
    public static void main(String[] args) {
        //somente varíaveis de referencia podem ser inicializados com null

        String[] alunos = new String[5];
        alunos[0] = "Tiago";
        alunos[1] = "Thais";
        alunos[2] = "Thais01";
        alunos[3] = "Thais02";
        alunos[4] = "Thais03";

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println("--------------------------");
        for (int i = 0; i < alunos.length; i++){
            System.out.println(alunos[i]);
        }
        System.out.println("##################################");
        alunos = new String[10];

        alunos[0] = "Tiago";
        alunos[1] = "Thais";
        alunos[2] = "Thais01";
        alunos[3] = "Thais02";
        alunos[4] = "Thais03";
        alunos[5] = "Thais04";
        alunos[6] = "Thais05";
        alunos[7] = "Thais06";
        alunos[8] = "Thais07";
        alunos[9] = "Thais08";

        for(int i = 0; i < alunos.length; i++){
            System.out.println(alunos[i]);
        }

        System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        for(String aluno: alunos){
            System.out.println(aluno);
        }

    }
}
