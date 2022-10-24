package academy.devdojo.maratonajava.javacore.Minterfaces.domain;



public class FileLoader implements DataLoader, RemoveLoader{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo!!!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo!!!");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking files permissions");
    }
}
