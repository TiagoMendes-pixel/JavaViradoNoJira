package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        databaseLoader.load();
        databaseLoader.remove();
        databaseLoader.checkPermission();


        System.out.println("--------------------------");
        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();
    }
}
