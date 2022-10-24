package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;

    private TipoSalario tipoSalario;

    public Cliente(String nome, TipoCliente tipoCliente, TipoSalario tipoSalario) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoSalario = tipoSalario;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoSalario=" + tipoSalario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoSalario getTipoSalario() {
        return tipoSalario;
    }

    public void setTipoSalario(TipoSalario tipoSalario) {
        this.tipoSalario = tipoSalario;
    }
}
