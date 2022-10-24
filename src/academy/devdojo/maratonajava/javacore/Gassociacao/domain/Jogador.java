package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Jogador {
    private String nome;
    private  Time time;

    public Jogador(String nome){
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprimeJogador(){
        System.out.println("----------------------");
        System.out.println(this.nome);
        System.out.println(time.getNome());
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
