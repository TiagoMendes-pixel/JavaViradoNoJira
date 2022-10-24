package academy.devdojo.maratonajava.javacore.ExercicioAssociaco.domain;

public class Seminario {
    protected String titulo;
    protected Aluno[] alunos;
    protected Local local;

    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void imprimeSeminario(){
        System.out.println("-----------------------------------------------------------");

        System.out.println("O título do seminário é: " + this.titulo + " E os alunos são: ");
        for(Aluno aluno: alunos){
            System.out.println(aluno.getNome() + " " + aluno.getIdade());
        }
        System.out.println(local.getEndereco());


    }
}
