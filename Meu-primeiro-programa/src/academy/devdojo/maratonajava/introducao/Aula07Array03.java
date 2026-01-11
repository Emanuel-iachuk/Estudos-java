package academy.devdojo.maratonajava.introducao;

/**
 * Aula prática sobre as 3 formas de declarar arrays em Java
 * Demonstra for tradicional vs for-each na iteração
 */
public class Aula07Array03 {

    public static void main(String[] args) {

        // 1️⃣ FORMA PADRÃO: Array com tamanho FIXO (inicializa com 0s)
        // Útil quando sabemos o tamanho, mas não os valores
        int[] idade = new int[3];  // Cria [0, 0, 0]
        System.out.println("Array vazio: " + java.util.Arrays.toString(idade));

        // 2️⃣ FORMA COM VALORES: new int[] {valores}
        // O Java conta automaticamente o tamanho (5 elementos aqui)
        int[] idade2 = new int[]{1, 2, 3, 4};

        // 3️⃣ FORMA SIMPLIFICADA: {valores} (mais limpa)
        // Equivalente à linha acima, sem o 'new int[]'
        int[] idade3 = {1, 2, 3, 4};

        // 🔥 FOR TRADICIONAL (indexado) - controla posição exata
        System.out.println("=== FOR TRADICIONAL ===");
        for (int i = 0; i < idade2.length; i++) {
            // i+1 pra mostrar posição "humana" (1,2,3...)
            System.out.println((i + 1) + " -> " + idade2[i]);
        }

        System.out.println("=".repeat(50));

        // 🔥 FOR-EACH (enhanced for) - mais limpo, SEM índice
        // Ideal pra percorrer TODO o array sem se preocupar com posição
        System.out.println("=== FOR-EACH ===");
        for (int age : idade3){
            System.out.println(age);  // age recebe cada valor automaticamente
        }

        // 💡 OBS: for-each NÃO dá acesso ao índice (use for tradicional se precisar)
    }
}
