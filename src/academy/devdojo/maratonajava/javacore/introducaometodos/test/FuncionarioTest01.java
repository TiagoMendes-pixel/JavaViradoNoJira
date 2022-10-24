package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.FuncinarioExercicio01;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        FuncinarioExercicio01 funcinario = new FuncinarioExercicio01();
        funcinario.setNome("Tiago");
        funcinario.setIdade(34);
        funcinario.setSalarios(new double[]{1200.0, 1500.0, 1822.2});
        funcinario.imprime();
        System.out.println("Média " + funcinario.getMedia());



    }
}
