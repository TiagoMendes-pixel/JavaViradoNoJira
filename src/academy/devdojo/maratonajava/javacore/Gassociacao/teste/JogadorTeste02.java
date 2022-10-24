package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Louco Abreu");
        Time time = new Time("Vasco");

        jogador01.setTime(time);

        jogador01.imprimeJogador();

    }
}
