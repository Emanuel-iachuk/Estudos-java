package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

/**
 * Classe de TESTE 3 - Demonstra MÉTODOS COM RETORNO vs VOID
 * Maratona Java DevDojo - Compara void x return na prática
 */
public class CalculadoraTest3 {

    /**
     * MÉTODO MAIN: Testa métodos com RETORNO e VOID
     * POO: Captura resultado + testa validação de erro
     */
    public static void main(String[] args) {
        // POO: CRIA INSTÂNCIA única pra todos testes
        Calculadora calc = new Calculadora();

        // TESTE 1: MÉTODO COM RETORNO (double)
        // Captura resultado e imprime
        System.out.println("90 ÷ 2 = " + calc.dividirNumeros(90, 2));   // 45.0 ✓

        // TESTE 2: Validação de ERRO (divisor zero)
        System.out.println("87 ÷ 0 = " + calc.dividirNumeros(87, 0));   // 0.0 ✓

        // TESTE 3: MÉTODO VOID (imprime direto)
        System.out.println("--- TESTE VOID ---");
        calc.dividirVoid(12, 2);  // "DIVISÃO VOID → 6.0" ✓
    }
}
