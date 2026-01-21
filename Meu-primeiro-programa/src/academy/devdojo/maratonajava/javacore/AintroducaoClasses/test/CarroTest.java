package academy.devdojo.maratonajava.javacore.AintroducaoClasses.test;

import academy.devdojo.maratonajava.javacore.AintroducaoClasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro veiculo = new Carro();
        Carro veiculo2 = new Carro();

        veiculo.nome = "Fiat Uno";
        veiculo.modelo = "Mille";
        veiculo.ano = 2010;

        veiculo2.nome = "Mustang";
        veiculo2.modelo = "GT 500";
        veiculo2.ano = 1968;

        System.out.println(veiculo.getCarro());
        System.out.println("-".repeat(10));
        System.out.println(veiculo2.getCarro());

    }
}
