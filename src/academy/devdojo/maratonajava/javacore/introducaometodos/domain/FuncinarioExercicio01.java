package academy.devdojo.maratonajava.javacore.introducaometodos.domain;

import java.util.Arrays;

public class FuncinarioExercicio01 {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    /*public void setMedia(double media) {
        this.media = media;
    }
*/
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario: salarios
             ) {
            System.out.print(salario + " ");
        }

        mediaSalario();
    }

    public void mediaSalario() {
        //double media = 0;
        int i;
        for (double salario: salarios
             ) {
            media += salario;

        }
        media = media/ salarios.length;
        System.out.println(" \nA média dos salários é de " + media);
    }


}
