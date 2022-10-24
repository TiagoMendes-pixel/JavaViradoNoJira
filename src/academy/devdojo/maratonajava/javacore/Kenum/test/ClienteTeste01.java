package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TipoSalario;


public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("tiago", TipoCliente.PESSOA_FISICA, TipoSalario.CONTA_CORRENTE);
        Cliente cliente02 = new Cliente("Thais", TipoCliente.PESSOA_JURIDICA, TipoSalario.CONTA_POUPANCA);

        System.out.println(cliente01);
        System.out.println(cliente02);

    }
}
