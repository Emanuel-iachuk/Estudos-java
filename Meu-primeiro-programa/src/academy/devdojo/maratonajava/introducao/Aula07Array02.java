package academy.devdojo.maratonajava.introducao;

public class Aula07Array02 {
    public static void main(String[] args) {
        // Valores padrões de cada tipo de array
        // byte, short, int, long, float, double -> 0
        // char -> '\u0000' (caractere vazio)
        // boolean -> false
        // String -> null

        // Por padrão os valores são zero
        int[] idades = new int[3];

        // For-each para percorrer o array
        for (int age : idades) {
            System.out.println(age); // Saída -> 0, 0, 0
        }
    }
}
