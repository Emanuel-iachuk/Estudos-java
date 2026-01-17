package academy.devdojo.maratonajava.introducao;

public class Aula07ArrayMultidimencional {
    public static void main(String[] args) {
        //Array multidimencional
        double[][] notas = {{8.9, 7.8, 9.0}, {7.9, 7.8, 8.9}, {9.0, 7.8, 8.2}};
        //Array normal
        double [] media = new double[3];

        //For para percorer o Array multidimencional
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                //Soma as notas de todos os alunos
                soma += notas[i][j];
            }
            media[i] = soma / 3;
            System.out.println(media[i]);
        }

        //Soma a media da sala
        double somaMediaSala = 0;
        for (int i = 0; i < media.length; i++) {
            somaMediaSala += media[i];
        }
        double mediaSala = somaMediaSala / 3;
        System.out.println("Media da sala: "+mediaSala);

    }
}
