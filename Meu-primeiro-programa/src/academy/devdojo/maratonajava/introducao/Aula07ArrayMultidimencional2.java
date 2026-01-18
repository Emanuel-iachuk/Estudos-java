package academy.devdojo.maratonajava.introducao;

public class Aula07ArrayMultidimencional2 {
    public static void main(String[] args) {

        // 📚 CONCEITO PRINCIPAL: ARRAY MULTIDIMENSIONAL IRREGULAR
        // int[][] = Array de Arrays (linha -> array de colunas)
        // new int[3][] = 3 linhas, colunas DEFINIDAS DEPOIS (irregular!)
        int[][] arrayInt = new int[3][];

        // ✅ FORMA 1: Array literal direto (mais comum)
        int[] alunos = {20, 23, 12};  // Array 1D comum

        // 📝 INICIALIZAÇÃO MANUAL linha por linha (array irregular)
        arrayInt[0] = new int[9];     // Linha 0: 9 elementos (todos 0)
        arrayInt[1] = alunos;         // Linha 1: REAPONTA pro array alunos
        arrayInt[2] = new int[5];     // Linha 2: 5 elementos (todos 0)

        // 🔧 MODIFICAÇÃO: arrayInt[0][0] = 12 sobrescreve o 1º zero
        arrayInt[0][0] = 12;

        // 🔄 FOR-EACH ANINHADO: Percorre array de arrays
        // int[] ints = cada LINHA do arrayInt
        for (int[] ints : arrayInt) {
            System.out.println("\n=======");  // Separador visual
            // int anInt = cada elemento da linha atual
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }

        // 🌈 ARRAY DOUBLE: 3 FORMAS de inicialização na MESMA linha
        // 1️⃣ {0.0, 1.1, 2.2} = double literal
        // 2️⃣ {2, 4, 5, 6, 7} = int AUTO-converte pra double
        // 3️⃣ {1, 2, 3...10} = 10 elementos (linha longa)
        double[][] arrayDouble = {{0.0, 1.1, 2.2}, {2, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};

        // 🎯 MESMO PADRÃO FOR-EACH
        for (double[] doubles : arrayDouble) {
            System.out.println("\n--------");
            for (double aDouble : doubles) {
                System.out.print(aDouble + " ");
            }
        }
    }
}
