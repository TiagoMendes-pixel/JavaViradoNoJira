package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, RemoveLoader {

    @Override
    public void load() {
        System.out.println("Caregando dados de um banco de dados!!!");

    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões do banco de dados!!!!!!!!!!");
    }
}
