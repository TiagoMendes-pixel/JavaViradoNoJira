package academy.devdojo.maratonajava.introducao;
import java.util.*;
/*
Prática

Cria variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi a salário de <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = input.nextLine();

        System.out.println("Digite seu endereço");
        String endereco = input.nextLine();

        System.out.println("Digite seu salário");
        double salario = input.nextDouble();

        System.out.println("Insira a data");
        String dataRecebimentoSalario = input.next();

        String relatorio = " Eu " + nome + " morando no endereço " + endereco + " confirmo que recebi o salário de " + salario + " na data " + dataRecebimentoSalario;

        //saida de dados
        System.out.println(relatorio);

    }
}
