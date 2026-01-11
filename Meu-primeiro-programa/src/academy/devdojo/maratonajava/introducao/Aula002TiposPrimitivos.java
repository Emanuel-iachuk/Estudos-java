package academy.devdojo.maratonajava.introducao;


public class Aula002TiposPrimitivos {
    /*Tipos primitivos são formas de guardar um valor na memória os tipos são:
    * int, byte, short, long, float, double boolean, char
    * Perceba que todos começão com letra maiúscula*/
    public static void main(String[] args) {
        byte numeroPequeno = 127;
        short numero = 32000;
        int numeroMedio = 2000000000; // Padrão
        long numeroGigante = 9000000000000000000L; //O (L) no final e para dizer que é grande

        float decimal = 12999999;
        double decimalGrande = 2000000000.000000000;

        boolean verdadeiroOuFalso = true; // verdadeiro -> false = falso
        char umCaracter = 'A';

        // String por, outro lado não e um tipo primitivo e sim um tipo de reférencia ou Objeto

        String nome = "Emanuel iachuk";


    }
}
