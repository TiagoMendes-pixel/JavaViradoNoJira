package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Takashi");
        Professor professor02 = new Professor("Augusto");
        Professor[] professors = new Professor[]{professor01, professor02};
        Escola escola1 = new Escola("USJT", professors);

        escola1.imprimeEscola();






    }
}
