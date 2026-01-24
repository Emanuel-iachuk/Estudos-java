package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        String espaco = "-".repeat(10);

        calc.somarNumeros(4, 3);
        System.out.println(espaco);
        calc.subtrairNumeros(14, 20);


    }

}
