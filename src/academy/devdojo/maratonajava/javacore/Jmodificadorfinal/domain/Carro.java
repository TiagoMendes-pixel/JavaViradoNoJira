package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Carro {
    private String nome;
    //As constantes no java precisal ser em letras maiúsculas e separadas por underScore
    public static final double VELOCIDADE_FINAL = 150;

    public Carro(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
