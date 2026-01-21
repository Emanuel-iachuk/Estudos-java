package academy.devdojo.maratonajava.javacore.AintroducaoClasses.test;

import academy.devdojo.maratonajava.javacore.AintroducaoClasses.dominio.Estudante;

public class EtudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.idade = 24;
        estudante.nome = "Cleusa Bomfim";
        estudante.sexo = 'F';

        System.out.println(estudante.getEstudante());
        System.out.println("-".repeat(10));
        //Aqui estamos imprimindo os valores padroes da classe Estudante
        System.out.println(estudante2.getEstudante());

    }
}
