package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;

public class Aula07ArrayMultidimencional {
    public static void main(String[] args) {
        //Array multidimencional
        double[][] notas = {{8.9, 7.8, 9.0}, {7.9, 7.8, 8.9}, {9.0, 7.8, 8.2}};
        //Array normal
        double [] media = new double[3];

        //For para percorer o Array multidimencional
        for (int i = 0; i < notas.length; i++) {
            //Soma as notas de todos os alunos
            media[i] = Arrays.stream(notas[i]).sum() / 3;
            System.out.println("Notas: "+media[i]);
        }
        //Soma todas as notas da sala
        double mediaSala = Arrays.stream(media).sum() / 3;
        System.out.println(mediaSala);
    }
}
