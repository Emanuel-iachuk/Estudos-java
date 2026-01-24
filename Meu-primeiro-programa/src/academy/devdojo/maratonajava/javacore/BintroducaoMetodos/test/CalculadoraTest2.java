package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

/**
 * Classe de TESTE 2 - Demonstra método específico de multiplicação
 * Maratona Java DevDojo - Testando métodos void individuais
 */
public class CalculadoraTest2 {

    /**
     * MÉTODO MAIN: Testa método multiplicarNumeros()
     * POO: Usa instância para chamar método com argumentos
     */
    public static void main(String[] args) {
        // POO: CRIA INSTÂNCIA da Calculadora
        Calculadora calc = new Calculadora();

        // TESTE: Método VOID multiplicarNumeros()
        // Argumentos 20, 29 → Parâmetros num1=20, num2=29
        calc.multiplicarNumeros(20, 29);  // Saída: "MULTIPLICAÇÃO → 580"
    }
}
