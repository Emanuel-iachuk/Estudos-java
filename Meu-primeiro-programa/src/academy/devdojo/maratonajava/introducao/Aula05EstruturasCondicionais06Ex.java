package academy.devdojo.maratonajava.introducao;


public class Aula05EstruturasCondicionais06Ex {
    public static void main(String[] args) {
        int dia = 3;
        String mensagem;
        // Novo switch com um case com múltiplas opcões foi lancado no java(17)
        switch (dia) {
            case 2, 3, 4, 5, 6:
                mensagem = "Dia util";
                break;
            case 1, 7:
                mensagem = "Final de semana";
                break;
            default:
                mensagem = "Invalido";
        }
        System.out.println(mensagem);
        // switch antigo
        switch (dia) {
            case 1:
            case 7:
                mensagem = "Final de semana";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                mensagem = "Dia util";
        }
        System.out.println(mensagem);


    }
}
