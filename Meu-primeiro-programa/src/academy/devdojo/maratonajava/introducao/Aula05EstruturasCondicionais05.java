package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class  {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        int dia = scn.nextInt();
        System.out.println();
        String mensagem;
        //switch antigo com break
        switch (dia){
            case 1: mensagem = "Segunda-Feira";
            break;
            case 2: mensagem = "Terça-Feira";
            break;
            case 3: mensagem = "Quarta-feira";
            break;
            case 4: mensagem = "Quinta-feira";
            break;
            case 5: mensagem = "Sexta-feira";
            break;
            case 6: mensagem = "Sábado";
            break;
            case 7: mensagem = "Domingo";
            break;
            default: mensagem = "Dia inválido";
        }
        System.out.println(mensagem);

        //switch moderno sem break
        switch (dia){
            case 1 -> mensagem = "Segunda-Feira";
            case 2 -> mensagem = "Terça-Feira";
            case 3 -> mensagem = "Quarta-feira";
            case 4 -> mensagem = "Quinta-feira";
            case 5 -> mensagem = "Sexta-feira";
            case 6 -> mensagem = "Sábado";
            case 7 -> mensagem = "Domingo";
            default -> mensagem = "Dia inválido";
        }
        System.out.println(mensagem);

        //switch com expressão retorna um valor
        String semana = switch (dia){
            case 1 -> "Segunda-Feira";
            case 2 -> "Terça-Feira";
            case 3 ->  "Quarta-feira";
            case 4 ->  "Quinta-feira";
            case 5 -> "Sexta-feira";
            case 6 ->  "Sábado";
            case 7 ->  "Domingo";
            default -> "Dia inválido";
        };

        System.out.println(semana);

        // switch com múltiplos valores
        String diasUteis = switch (dia){
            case 1,2,3,4,5 -> "Dia útil";
            case 6,7 -> "Final de semana";
            default -> "Invalido";
        };
        System.out.println(diasUteis);
        scn.close();

    }
}
