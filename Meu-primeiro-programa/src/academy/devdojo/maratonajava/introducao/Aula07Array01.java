package academy.devdojo.maratonajava.introducao;

public class Aula07Array01 {
    public static void main(String[] args) {
        //Array com três possições, todo array são tipos referência;
        //Observação: todo Array começa com o indice 0, ou seja (0, 1, 2)
        int [] idades = new int[3];

        // Atribuindo valor ao indice 0;
        idades[0] = 21;
        idades[1] = 81;
        idades[2] = 45;

        //Isso vai dar um erro por que o Array so tem 3 indices 0, 1, 2
        idades[3] = 5; // -> erro


        System.out.println(idades[0]); // -> 21
    }
}
