package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Tiago");
        Jogador jogador02 = new Jogador("Rafael");
        Jogador jogador03 = new Jogador("Claudio");
        Jogador[] jogadores = new Jogador[]{jogador01, jogador02, jogador03};
        for (Jogador j1 : jogadores) {
            j1.imprimeJogador();
        }

        Jogador[] jogadors = new Jogador[3];
        jogadors[0] = jogador01;
        jogadors[1] = jogador02;
        jogadors[2] = jogador01;

        for(Jogador jogaBonito: jogadors){
            jogaBonito.imprimeJogador();
        }






    }

}
