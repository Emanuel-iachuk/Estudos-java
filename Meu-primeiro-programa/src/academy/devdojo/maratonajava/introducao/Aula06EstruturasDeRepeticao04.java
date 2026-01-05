package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorCarro = 459750;


        for (int i = 1; i <= valorCarro; i++) {
            double valorParcela =valorCarro / i;
            if (valorParcela < 1000) {
                //break para a execução assim que o if virar verdadeiro
                break;
            }
            System.out.println("Parcelas: " + i + " Valor: " + valorParcela);
            //.repeat() repete a String desejada
            System.out.println("=".repeat(50));

        }


    }
}
