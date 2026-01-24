package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double result = calc.dividirNumeros(90, 2);

        int result2 = (int) calc.dividirNumeros(87, 4);

        System.out.println(result);
        System.out.println(result2);
    }
}
