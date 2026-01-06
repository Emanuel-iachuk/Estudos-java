package academy.devdojo.maratonajava.introducao;


public class Aula06EstruturasDeRepeticao02Ex {
    public static void main(String[] args) {
        //for que pula de 100 em 100
        for (int i = 0; i <= 1000000; i+= 100) {
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
            }
        }
        }
}

