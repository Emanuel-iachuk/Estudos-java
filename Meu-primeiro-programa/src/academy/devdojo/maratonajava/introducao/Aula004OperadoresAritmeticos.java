package academy.devdojo.maratonajava.introducao;

import java.math.BigDecimal;

public class Aula004OperadoresAritmeticos {
    // Principais operadores Aritiméticos são:
    // + - * /

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 34;

        System.out.println("Valor: "+(n1 * n2));

        //Operador de resto representado pela %
        int resto = 10 % 3;

        System.out.println(resto);

        // Operadores logicos sempre vão retornar um valor booleano eles são:
        // <, >, <=, >=, ==, !=

        if (10 > 12)System.out.println(">"); // falso
        if (10 < 12)System.out.println("<"); // verdadeiro
        if (10 == 12)System.out.println("=="); // falso
        if (10 != 12)System.out.println("!="); // verdadeiro
        if (10 >= 12)System.out.println(">="); // falso
        if (10 <= 12)System.out.println("<="); // verdadeiro

        // Outros operadores lógicos são:
        // && (AND) Ambas devem ser verdadeiras;
        // || (or) Somente uma precisa ser verdadeira;
        // ! (Not) Inverte o valor;

        boolean a = false;
        boolean b = true;

        System.out.println(a && b); // false (AND: Ambas verdadeiras);
        System.out.println(a || b); // true (Or: Somente uma verdadeira);
        System.out.println(!b); // false (NOT: inverte);

        double valorConta = 1235.00;
        double valorProduto = 5000.00;
        double contaPoupanca = 4010.00;

        boolean compraDoProduto = valorConta >= valorProduto || (contaPoupanca + valorConta) >= valorProduto;
        if (compraDoProduto) {
            double sobra = (valorConta + contaPoupanca) - valorProduto;
            System.out.println("Seu troco: " + sobra);
        }else {
            System.out.println("Voçê é BETAAAA!!!");
        }

        // Operadores de atribuição:
        // =, +=, -=, *=, /=, %=;
        int bonus = 100;

        // Equivalentes:
        bonus += 200;  // bonus = bonus + 200;    → 300
        bonus -= 250;  // bonus = bonus - 250;    → 50
        bonus *= 2;    // bonus = bonus * 2;      → 100
        bonus /= 2;    // bonus = bonus / 2;      → 50
        bonus %= 2;    // bonus = bonus % 2;      → 0

        // Operadores unários de incremento/decremento
        // ++ = Incremento(+1), -- = Decremento(-1)
        // Dois modos importantes:
        //  ++x = Incrementa antes de executar, x++ = Executa primeiro e depois Incrementa;
        // --x = Decrementa Antes de executar, x-- = Executa primeiro e depois decrementa

        int x = 0;
        System.out.println(++x); // Imprime: 1 (x agora = 1)  ← PRE
        System.out.println(x++); // Imprime: 1 (x agora = 2)  ← POS

        int y = 2;
        System.out.println(y--); // Imprime: 2 (y agora = 1)  ← POS
        System.out.println(--y); // Imprime: 0 (y agora = 0)  ← PRE














    }
}
