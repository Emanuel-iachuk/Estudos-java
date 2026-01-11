package academy.devdojo.maratonajava.introducao;


public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Se o salário for maior de 4000 você pode doar
        double salario = 4001;
        String mensagemDoar = "Obrigado pela doação, você tem um lugar especial nos nossos corações";
        String mensagemNaoDoar = "Obrigado mesmo assim";
        //Operador Ternario -> variavel = condição ? verdadeiro : falso;
        String resultado = salario > 4000 ? mensagemDoar : mensagemNaoDoar;

        //O operador ternario pode ser usada com qualquer tipo primitivo;
        boolean isPossoDoar = salario > 4000 ? true : false;

        if (isPossoDoar) {
            System.out.println("Você doou 4000 reais.");
        }else {
            System.out.println("Você não doou.");
        }


        System.out.println(resultado);
    }
}
