package academy.devdojo.maratonajava.introducao;

import java.util.stream.IntStream;


public class Aula06EstruturasDeRepeticao01 {
    /**
     * DEMONSTRAÇÃO COMPLETA: 5 estruturas de repetição Java
     * Maratona DevDojo - Aula 06 ✓
     */
    public static void main(String[] args) {
        // ===============================================
        // 1. FOR-EACH (Array → valores DIRETOS)
        // ===============================================
        String[] semana = {"Seg", "Ter", "Qua", "Qui", "Sex", "Sab", "Dom"};
        int contador = 1;
        // For-Each: PEGA VALORES DIRETO (não índices)
        for (String dia : semana) {
            System.out.println(contador + ": " + dia);
            contador++;  // Manual pra numerar 1-7
        }
        // SAÍDA: 1: Seg, 2: Ter... 7: Dom ✓

        System.out.println("=".repeat(50)); // Separador visual

        // ===============================================
        // 2. FOR TRADICIONAL (precisa ÍNDICE)
        // ===============================================
        // for(início; condição; incremento)
        for (int i = 0; i < 10; i++) {
            System.out.println("FOR i=" + i); // 0 até 9
        }
        // QUANDO USAR: sei QUANTAS repetições EXATAS

        System.out.println("=".repeat(50));

        // ===============================================
        // 3. WHILE (não sei quantas vezes)
        // ===============================================
        int j = 0; // ← VARIÁVEL FORA do while!
        while (j < 10) {
            System.out.println("WHILE j=" + j);
            j++;  // ← CRÍTICO! Sem isso = LOOP INFINITO ☠️
        }
        // QUANDO USAR: usuário digita, condição incerta

        System.out.println("=".repeat(50));

        // ===============================================
        // 4. DO-WHILE (executa 1x MÍNIMO)
        // ===============================================
        int count = 0;
        do {  // Executa PRIMEIRO, testa DEPOIS
            System.out.println("DO-WHILE count=" + count);
            count++;
        } while (count < 10);  // count=10 SAI
        // QUANDO USAR: menu (1ª tela sempre aparece)

        System.out.println("=".repeat(50));

        // ===============================================
        // 5. INTSTREAM (Java 8+ SENIOR level)
        // ===============================================
        // range(0,7) = índices 0,1,2,3,4,5,6
        IntStream.range(0, 7).forEach(i ->
                System.out.println((i + 1) + ": " + semana[i])
        );
        // SAÍDA: 1: Seg... 7: Dom (igual for-each)
        // QUANDO USAR: GitHub/Entrevista (impressiona!)
    }
}
