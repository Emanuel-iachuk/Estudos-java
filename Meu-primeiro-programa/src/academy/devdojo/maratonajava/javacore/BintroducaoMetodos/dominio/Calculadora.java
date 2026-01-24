package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

/**
 * Classe Calculadora - Demonstra POO e TIPOS DE RETORNO
 * Maratona Java DevDojo - Introdução a Métodos + POO
 */
public class Calculadora {

    /**
     * POO: MÉTODO VOID (não retorna valor, só EXECUTA ação)
     * Usa parâmetros para receber argumentos e imprime resultado
     * @param n1 primeiro argumento inteiro
     * @param n2 segundo argumento inteiro
     */
    public void somarNumeros(int n1, int n2) {
        System.out.println("SOMA → " + (n1 + n2));
    }

    /**
     * POO: MÉTODO VOID - ação de subtração
     * @param n1 minuendo (primeiro parâmetro)
     * @param n2 subtraendo (segundo parâmetro)
     */
    public void subtrairNumeros(int n1, int n2) {
        System.out.println("SUBTRAÇÃO → " + (n1 - n2));
    }

    /**
     * POO: MÉTODO VOID - ação de multiplicação
     * @param num1 primeiro fator
     * @param num2 segundo fator
     */
    public void multiplicarNumeros(int num1, int num2) {
        System.out.println("MULTIPLICAÇÃO → " + (num1 * num2));
    }

    /**
     * POO: MÉTODO COM RETORNO (double) - DEVOLVE resultado
     * Diferença chave: void só executa, return devolve valor
     * @param num1 dividendo
     * @param num2 divisor (NÃO PODE ser zero)
     * @return resultado da divisão ou 0 (caso de erro)
     */
    public double dividirNumeros(double num1, double num2) {
        if (num2 == 0) {           // ← VALIDAÇÃO CORRETA
            return 0;              // ← RETORNO DE SEGURANÇA
        }
        return num1 / num2;        // ← RETORNA valor pra usar depois
    }

    /**
     * POO: MÉTODO VOID COM VALIDAÇÃO (exemplo didático)
     * void + return EARLY = sai do método sem crash
     * @param num1 dividendo
     * @param num2 divisor
     */
    public void dividirVoid(double num1, double num2){
        if(num2 == 0){             // ← VALIDAÇÃO CORRETA
            System.out.println("ERRO: Divisor não pode ser zero!");
            return;                // ← POO: return EARLY em void
        }
        System.out.println("DIVISÃO VOID → " + (num1/num2));
    }
}
