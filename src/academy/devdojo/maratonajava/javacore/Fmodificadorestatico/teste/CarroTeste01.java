package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(600);

        Carro c1 = new Carro("BMW", 280.9);
        Carro c2 = new Carro("Porsche", 400);
        Carro c3 = new Carro("Volvo", 350);

        c1.imprimeCarro();
        c2.imprimeCarro();
        c3.imprimeCarro();



    }
}
