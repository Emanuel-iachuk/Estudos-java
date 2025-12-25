package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula002TiposPrimitivos {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

            while (true) {
                System.out.print("Escolha seu sexo Masculino(M), Feminino(F): ");
                char sexo = scn.next().charAt(0);
                char sexoMaiusculo = Character.toUpperCase(sexo);
                if (sexoMaiusculo == 'M') {
                    System.out.println("Sexo Masculino selecionado.");
                    break;
                } else if (sexoMaiusculo == 'F') {
                    System.out.println("Sexo Feminino selecionado.");
                    break;
                } else {
                    System.out.println("Valor invalido");
                }
            }
            scn.close();

    }
}
