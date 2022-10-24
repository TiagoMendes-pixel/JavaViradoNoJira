package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa{
    private String salario;

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
