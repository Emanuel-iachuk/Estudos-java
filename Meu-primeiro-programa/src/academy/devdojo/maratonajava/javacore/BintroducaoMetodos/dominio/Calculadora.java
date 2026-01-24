package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

import java.sql.Array;

public class Calculadora {

    public void somarNumeros(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public void subtrairNumeros(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    public void multiplicarNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividirNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("ERRO: Divisor não pode ser zero!");
        }
        return num1 / num2;
    }
}
