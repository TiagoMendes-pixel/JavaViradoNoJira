package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Pessoa {

    private String cpf;
    private String nome;
    private Endereco endereco;



   public void imprime(){
       System.out.println(this.nome);
       System.out.println(this.cpf);
       System.out.println(endereco.getRua());
       System.out.println(endereco.getCep());
   }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
