package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

/**
 * Classe de TESTE - Demonstra uso da Calculadora (POO na prática)
 * Maratona Java DevDojo - Testando métodos e instâncias
 */
public class CalculadoraTest {

    /**
     * MÉTODO MAIN: Entry point do programa
     * POO: Cria instância e chama métodos da classe Calculadora
     */
    public static void main(String[] args) {
        // POO: INSTÂNCIA da classe Calculadora (objeto real)
        Calculadora calc = new Calculadora();

        // UTILITÁRIO: Cria separador visual (Java 11+)
        String espaco = "-".repeat(10);  // ← "----------"

        // TESTE MÉTODOS VOID: só executam, não devolvem valor
        calc.somarNumeros(4, 3);           // Argumentos → Parâmetros
        System.out.println(espaco);        // Separador visual
        calc.subtrairNumeros(14, 20);      // Resultado negativo OK

    }
}
