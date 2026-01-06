package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //continue pula números PARES → imprime só ÍMPARES
            if (i % 2 == 0) continue;

            System.out.println(i);
        }
    }
}
